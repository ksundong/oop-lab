package movie.discountcondition;

import movie.Screening;

public interface DiscountCondition {

  boolean isSatisfiedBy(Screening screening);
}
