package pro._21it;

public final class ConsoleAuditWriter {
    public void writeOrderCreate(Order order) {
        System.out.println("audit: order created for " + order.getCustomer().getName());
    }

    public void writeOrderCancel(Order order) {
        System.out.println("audit: order " + order.getId());
    }
}
