package movie.discountpolicy;

import movie.Money;
import movie.Screening;

public class NoneDiscountPolicy extends DefaultDiscountPolicy {

  @Override
  protected Money getDiscountAmount(Screening screening) {
    return Money.ZERO;
  }
}
