package movie.discountpolicy;

import java.util.Arrays;
import java.util.List;
import movie.Money;
import movie.Screening;
import movie.discountcondition.DiscountCondition;

public abstract class DefaultDiscountPolicy implements DiscountPolicy {

  private final List<DiscountCondition> conditions;

  protected DefaultDiscountPolicy(DiscountCondition... conditions) {
    this.conditions = Arrays.asList(conditions);
  }

  @Override
  public Money calculateDiscountAmount(Screening screening) {
    for (DiscountCondition each : conditions) {
      if (each.isSatisfiedBy(screening)) {
        return getDiscountAmount(screening);
      }
    }

    return Money.ZERO;
  }

  protected abstract Money getDiscountAmount(Screening screening);
}
