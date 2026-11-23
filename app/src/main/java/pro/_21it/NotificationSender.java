package pro._21it;

interface NotificationSender {

    void sendOrderCreated(Order order);

    void sendOrderCanceled(Order order);
}
