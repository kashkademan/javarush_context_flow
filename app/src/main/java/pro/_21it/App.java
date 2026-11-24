package pro._21it;

import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pro._21it.config.AppConfig;

public final class App {
    public static void main(String[] args) {

        getContext();

        // Выбор реализаций (инфраструктура)
        OrderStore store = new InMemoryOrderStore();
        DiscountPolicy discountPolicy = new LoyalCustomerDiscountPolicy();
        NotificationSender sender = new ConsoleNotificationSender();
        AuditWriter auditWriter = new ConsoleAuditWriter();
        OrderIdGenerator idGenerator = new DeterministicOrderIdGenerator();

        OrderService orderService = new OrderService(
                store,
                discountPolicy,
                sender,
                auditWriter,
                idGenerator
        );

        ScenarioRunner runner = new ScenarioRunner(orderService);
        runner.run();
    }

    public static void getContext() {
        // Контекст — это ресурс: его нужно закрывать, поэтому используем try-with-resources
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) { // Передаём конфигурацию

            // Достаём bean по имени и типу: полезно для старта, но не для бизнес-кода
            String appName = context.getBean("appName", String.class);

            System.out.println("App = " + appName); // App = ContextFlow
        } // Здесь автоматически вызовется close() контекста
    }
}
