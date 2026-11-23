package pro._21it;

import java.util.UUID;

public class UuidOrderIdGenerator implements OrderIdGenerator {
    @Override
    public String nextId() {
        return UUID.randomUUID().toString();
    }
}
