package pro._21it;

// Команда (DTO) для сценария создания заказа: "ингредиенты" конкретного запуска
public record CreateOrderCommand(
        Customer customer,
        int totalAmount
) {
}
