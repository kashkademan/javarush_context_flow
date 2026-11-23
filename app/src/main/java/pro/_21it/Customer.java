package pro._21it;

// Клиент — это входные данные сценария (создаём на запуск сценария, не инжектим как сервис)
public record Customer(
        String id,
        String name,
        LoyaltyLevel loyaltyLevel
) {
}
