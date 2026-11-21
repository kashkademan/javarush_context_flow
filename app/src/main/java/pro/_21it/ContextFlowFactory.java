package pro._21it;

public final class ContextFlowFactory {
    private final OrderStore orderStore = new InMemoryOrderStore();
    private final AuditWriter auditWriter = new ConsoleAuditWriter();

    public ScenarioRunner scenarioRunner() {
        return new ScenarioRunner(orderService());
    }

    private OrderService orderService() {
        return new OrderService(
            orderStore,
            new NoDiscountPolicy(),
            new ConsoleNotificationSender(),
            auditWriter,
            new DeterministicOrderIdGenerator()
        );
    }
}
