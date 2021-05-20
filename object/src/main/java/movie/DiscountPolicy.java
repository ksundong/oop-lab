package movie;

import java.util.Arrays;
import java.util.List;
import movie.discountcondition.DiscountCondition;

public abstract class DiscountPolicy {

  private final List<DiscountCondition> conditions;

  protected DiscountPolicy(DiscountCondition... conditions) {
    this.conditions = Arrays.asList(conditions);
  }

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
