package pro._21it;

public final class DeterministicOrderIdGenerator implements OrderIdGenerator {
    private int nextNumber = 1;

    @Override
    public String nextId() {
        return "ORD-" + nextNumber++;
    }
}
