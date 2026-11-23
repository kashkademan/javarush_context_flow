package pro._21it;

public final class Customer {
    private final String name;
    private boolean isLoyal;

    public Customer(String name, boolean isLoyal) {
        this.name = name;
        this.isLoyal = isLoyal;
    }

    public String getName() {
        return name;
    }

    public boolean isLoyal() {
        return isLoyal;
    }
}

