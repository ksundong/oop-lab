package movie.discountpolicy;

import movie.Money;
import movie.Screening;
import movie.discountcondition.DiscountCondition;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {

  private final Money discountAmount;

  public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
    super(conditions);
    this.discountAmount = discountAmount;
  }

  @Override
  protected Money getDiscountAmount(Screening screening) {
    return discountAmount;
  }
}
