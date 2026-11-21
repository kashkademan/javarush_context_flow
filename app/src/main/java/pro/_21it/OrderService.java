package pro._21it;

public class OrderService {
    private final OrderStore orderStore;
    private final DiscountPolicy discountPolicy;
    private final NotificationSender notificationSender;
    private final AuditWriter auditWriter;
    private final OrderIdGenerator orderIdGenerator;

    public OrderService(
            OrderStore orderStore,
            DiscountPolicy discountPolicy,
            NotificationSender notificationSender,
            AuditWriter auditWriter,
            OrderIdGenerator orderIdGenerator
            ) {
        this.orderStore = orderStore;
        this.discountPolicy = discountPolicy;
        this.notificationSender = notificationSender;
        this.auditWriter = auditWriter;
        this.orderIdGenerator = orderIdGenerator;
    }

    public Order placeOrder(CreateOrderCommand command) {
        Order order = new Order(orderIdGenerator.nextId(), command.getCustomer());
        Order savedOrder = orderStore.save(order);
        notificationSender.sendOrderCreate(savedOrder);
        auditWriter.writeOrderCreate(savedOrder);
        return savedOrder;
    }

    public Order cancelOrder(CancelOrderCommand command) {
        Order order = orderStore.getById(command.getOrderId()).orElseThrow();
        Order savedOrder = orderStore.save(order);
        auditWriter.writeOrderCancel(savedOrder);
        return savedOrder;
    }
}
