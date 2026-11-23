package pro._21it;

public final class Order {
    private final String id;
    private final Customer customer;
    private final int total;
    private OrderStatus status;

    public Order(String id, Customer customer, int total) {
        this.id = id;
        this.customer = customer;
        this.total = total;
        this.status = OrderStatus.NEW;
    }

    public String getId() {
        return id;
    }

    public int getTotal() {
        return total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void cancel() {
        this.status = OrderStatus.CANCELLED;
    }
}

