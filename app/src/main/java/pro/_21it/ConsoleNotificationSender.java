package pro._21it;

public final class ConsoleNotificationSender implements NotificationSender {

    @Override
    public void sendOrderCreated(Order order) {
        System.out.println("[NOTIFY] Order created: " + order.id());
    }

    @Override
    public void sendOrderCanceled(Order order) {
        System.out.println("[NOTIFY] Order canceled: " + order.id());
    }
}
