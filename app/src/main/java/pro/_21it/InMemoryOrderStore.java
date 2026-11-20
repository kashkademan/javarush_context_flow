package pro._21it;

import java.util.Map;
import java.util.HashMap;

public final class InMemoryOrderStore {
    private final Map<String, Order> orders = new HashMap<>();
    private int nextNumber = 1;

    public String nextId() {
        return "ORD-" + nextNumber++;
    }

    public Order save(Order order) {
        orders.put(order.getId(), order);
        System.out.println("Number of orders " + orders.size());
        return order;
    }

    public Order getById(String orderId) {
        System.out.println("Number of orders " + orders.size());
        System.out.println("Searching order " + orderId);
        System.out.println("Order found " + orders.get(orderId));
        return orders.get(orderId);
    }
}

