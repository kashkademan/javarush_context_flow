package pro._21it;

import java.util.Optional;

interface OrderStore {

    void save(Order order);

    Optional<Order> getById(String orderId);
}
