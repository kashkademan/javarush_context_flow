package pro._21it;

public final class ConsoleNotificationSender implements NotificationSender {

    @Override
    public void sendOrderCreate(Order order) {
        System.out.println("[NOTIFY] order created for " + order.getCustomer().getName());
        System.out.println("[NOTIFY] order created with id " + order.getId());
    }
}
