package pro._21it;

import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

public final class InMemoryOrderStore implements OrderStore {
    private final Map<String, Order> orders = new HashMap<>();

    @Override
    public void save(Order order) {
        orders.put(order.id(), order);
    }

    @Override
    public Optional<Order> getById(String orderId) {
        return Optional.ofNullable(orders.get(orderId));
    }
}

