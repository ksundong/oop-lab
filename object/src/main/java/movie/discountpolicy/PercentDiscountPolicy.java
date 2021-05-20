package movie.discountpolicy;

import movie.Money;
import movie.Screening;
import movie.discountcondition.DiscountCondition;

public class PercentDiscountPolicy extends DiscountPolicy {

  private final double percent;

  public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
    super(conditions);
    this.percent = percent;
  }

  @Override
  protected Money getDiscountAmount(Screening screening) {
    return screening.getMovieFee().times(percent);
  }
}
