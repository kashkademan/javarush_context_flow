package pro._21it;

public final class ConsoleNotificationSender {
    public void sendOrderCreate(Order order) {
        System.out.println("notificatoin: order created for " + order.getCustomer().getName());
        System.out.println("notificatoin: order created with id " + order.getId());
    }
}
