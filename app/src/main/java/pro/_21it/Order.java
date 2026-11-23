package pro._21it;

public record Order(
        String id,
        Customer customer,
        int totalAmount,
        OrderStatus status
) {
}
