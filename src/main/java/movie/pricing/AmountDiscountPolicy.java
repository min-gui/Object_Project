package movie.pricing;

import movie.DiscountCondition;
import movie.DiscountPolicy;
import movie.Money;
import movie.Screening;

public class AmountDiscountPolicy implements DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {

        this.discountAmount = discountAmount;
    }


    protected Money getDiscountAmount(Screening Screening) {
        return discountAmount;
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return null;
    }
}
