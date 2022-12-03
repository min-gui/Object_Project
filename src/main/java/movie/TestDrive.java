package movie;

import movie.pricing.AmountDiscountPolicy;
import movie.pricing.PercentDiscountPolicy;

import java.time.Duration;

public class TestDrive {

    public static void main(String[] args) {
        Movie avatar = new Movie(
                "아바타",
                Duration.ofMinutes(120),
                Money.wons(10000),
                new AmountDiscountPolicy(Money.wons(800)));
        avatar.changeDiscountPolicy(new PercentDiscountPolicy(0.3));
    }
}
