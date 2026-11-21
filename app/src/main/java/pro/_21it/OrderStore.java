package pro._21it;

import java.util.Optional;

interface OrderStore {

    Order save(Order order);

    Optional<Order> getById(String orderId);
}
