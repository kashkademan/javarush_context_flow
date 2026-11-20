package pro._21it;

public class OrderService {
    private final InMemoryOrderStore orderStore;
    private final ConsoleNotificationSender notificationSender;
    private final ConsoleAuditWriter auditWriter;

    public OrderService(
            InMemoryOrderStore orderStore,
            ConsoleNotificationSender notificationSender,
            ConsoleAuditWriter auditWriter
            ) {
        this.orderStore = orderStore;
        this.notificationSender = notificationSender;
        this.auditWriter = auditWriter;
    }

    public Order placeOrder(CreateOrderCommand command) {
        Order order = new Order(orderStore.nextId(), command.getCustomer());
        Order savedOrder = orderStore.save(order);
        notificationSender.sendOrderCreate(savedOrder);
        auditWriter.writeOrderCreate(savedOrder);
        return savedOrder;
    }

    public Order cancelOrder(CancelOrderCommand command) {
        Order order = orderStore.getById(command.getOrderId());
        Order savedOrder = orderStore.save(order);
        auditWriter.writeOrderCancel(savedOrder);
        return savedOrder;
    }
}
