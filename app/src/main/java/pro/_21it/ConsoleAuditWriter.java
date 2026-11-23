package pro._21it;

public final class ConsoleAuditWriter implements AuditWriter {

    @Override
    public void write(String message) {
        System.out.println("[AUDIT] " + message);
    }
}
