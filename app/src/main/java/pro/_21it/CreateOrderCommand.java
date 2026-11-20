package pro._21it;

public final class CreateOrderCommand {
    private final Customer customer;

    public CreateOrderCommand(Customer customer) {
        this.customer = customer;
    }

    public CreateOrderCommand(String name) {
        this.customer = new Customer(name);
    }

    public Customer getCustomer() {
        return customer;
    }
}
