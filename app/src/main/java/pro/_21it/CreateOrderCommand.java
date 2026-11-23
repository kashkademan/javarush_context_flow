package pro._21it;

public final class CreateOrderCommand {
    private final Customer customer;

    public CreateOrderCommand(Customer customer) {
        this.customer = customer;
    }

    public CreateOrderCommand(String name, boolean isLoyal) {
        this.customer = new Customer(name, isLoyal);
    }

    public Customer getCustomer() {
        return customer;
    }
}
