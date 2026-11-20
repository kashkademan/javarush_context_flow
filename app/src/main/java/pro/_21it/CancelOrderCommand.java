package pro._21it;

public final class CancelOrderCommand {
    private final String orderId;

    public CancelOrderCommand(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }
}
