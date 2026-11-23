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
        String id = orderIdGenerator.nextId();

        int discount = discountPolicy.discountFor(command.customer(), command.totalAmount());
        int finalTotal = command.totalAmount() - discount;

        Order order = new Order(id, command.customer(), finalTotal, OrderStatus.NEW);

        orderStore.save(order);
        notificationSender.sendOrderCreated(order);
        auditWriter.write("created " + id + ", finalTotal=" + finalTotal);

        return order;
    }

    public Order cancelOrder(CancelOrderCommand command) {
        Order order = orderStore.getById(command.getOrderId()).orElseThrow();
        orderStore.save(order);
        notificationSender.sendOrderCanceled(order);
        auditWriter.write("Order " + order.id() + " was canceled.");
        return order;
    }
}
