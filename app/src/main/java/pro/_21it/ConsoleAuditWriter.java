package pro._21it;

public final class ConsoleAuditWriter implements AuditWriter {

    @Override
    public void writeOrderCreate(Order order) {
        System.out.println("audit: order created for " + order.getCustomer().getName());
    }

    @Override
    public void writeOrderCancel(Order order) {
        System.out.println("audit: order " + order.getId());
    }
}
