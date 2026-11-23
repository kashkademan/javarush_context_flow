package pro._21it;

public final class ScenarioRunner {
    private final OrderService orderService;

    public ScenarioRunner(OrderService orderService) {
        this.orderService = orderService;
    }

    public void run() {
        Customer customer = new Customer("C-1", "Алиса", LoyaltyLevel.GOLD);
        CreateOrderCommand createCommand = new CreateOrderCommand(customer, 1000);

        Order order = orderService.placeOrder(createCommand);

        CancelOrderCommand cancelCommand = new CancelOrderCommand(order.id());
        order = orderService.cancelOrder(cancelCommand);
    }
}
