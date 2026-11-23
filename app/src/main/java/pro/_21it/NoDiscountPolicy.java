package pro._21it;

public final class NoDiscountPolicy implements DiscountPolicy {

    @Override
    public int discountFor(Customer customer, int total) {
        // Политика по умолчанию: скидок нет
        return 0;
    }
}
