package pro._21it;

import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

public final class InMemoryOrderStore implements OrderStore {
    private final Map<String, Order> orders = new HashMap<>();

    @Override
    public Order save(Order order) {
        orders.put(order.getId(), order);
        System.out.println("Number of orders " + orders.size());
        return order;
    }

    @Override
    public Optional<Order> getById(String orderId) {
        System.out.println("Number of orders " + orders.size());
        System.out.println("Searching order " + orderId);
        System.out.println("Order found " + orders.get(orderId));
        return Optional.ofNullable(orders.get(orderId));
    }
}

