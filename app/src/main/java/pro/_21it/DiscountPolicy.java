package pro._21it;

interface DiscountPolicy {
    // Возвращаем сумму скидки (в условных "денежных единицах"), а не итоговую цену
    int discountFor(Customer customer, int total);
}
