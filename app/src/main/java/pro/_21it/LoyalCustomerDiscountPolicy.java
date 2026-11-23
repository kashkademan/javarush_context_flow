package pro._21it;

public class LoyalCustomerDiscountPolicy implements DiscountPolicy {
    public int discountFor(Customer customer, int total) {
        // Пример бизнес-правила: лояльному клиенту 10% от суммы
        return customer.isLoyal() ? (total / 10) : 0; // 10%
    }
}
