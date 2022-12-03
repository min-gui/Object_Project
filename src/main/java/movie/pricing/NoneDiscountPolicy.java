package movie.pricing;

import movie.DiscountPolicy;
import movie.Money;
import movie.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
