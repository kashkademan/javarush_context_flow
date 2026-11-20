package pro._21it;

public final class Order {
    private final String id;
    private final Customer customer;
    private OrderStatus status;

    public Order(String id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.status = OrderStatus.NEW;
    }

    public String getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void cancel() {
        this.status = OrderStatus.CANCELLED;
    }
}

