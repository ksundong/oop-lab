package movie.discountpolicy;

import movie.Money;
import movie.Screening;

public interface DiscountPolicy {

  Money calculateDiscountAmount(Screening screening);
}
