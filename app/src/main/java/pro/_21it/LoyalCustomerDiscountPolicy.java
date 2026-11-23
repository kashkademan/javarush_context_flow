package pro._21it;

public class LoyalCustomerDiscountPolicy implements DiscountPolicy {
    public int discountFor(Customer customer, int total) {
        // Условие по уровню лояльности — часть бизнес-правила (вынесена в отдельную роль)
        // Скидка: 10% от суммы, но не больше 200
        return customer.loyaltyLevel() == LoyaltyLevel.GOLD ? Math.min(200, total / 10) : 0;
    }
}
