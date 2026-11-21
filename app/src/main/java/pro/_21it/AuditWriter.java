package pro._21it;

interface AuditWriter {

    void writeOrderCreate(Order order);

    void writeOrderCancel(Order order);
}
