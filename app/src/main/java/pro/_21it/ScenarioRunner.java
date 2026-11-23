package pro._21it;

public final class ScenarioRunner {
    private final OrderService orderService;

    public ScenarioRunner(OrderService orderService) {
        this.orderService = orderService;
    }

    public void run() {
        CreateOrderCommand createCommand = new CreateOrderCommand(new Customer("Alice", false));
        Order order = orderService.placeOrder(createCommand);
        System.out.println("order id: " + order.getId());

        CancelOrderCommand cancelCommand = new CancelOrderCommand(order.getId());
        order = orderService.cancelOrder(cancelCommand);
        System.out.println("order id: " + order.getId());
    }
}
