package datadriventicket;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import movie.Money;

public class Movie {

  private String title;
  private Duration duration;
  private Money fee;
  private List<DiscountCondition> discountConditions;

  private MovieType movieType;
  private Money discountAmount;
  private double discountPercent;

  public Money calculateAmountDiscountedFee() {
    if (movieType != MovieType.AMOUNT_DISCOUNT) {
      throw new IllegalArgumentException();
    }

    return fee.minus(discountAmount);
  }

  public Money calculatePercentDiscountedFee() {
    if (movieType != MovieType.PERCENT_DISCOUNT) {
      throw new IllegalArgumentException();
    }

    return fee.minus(fee.times(discountPercent));
  }

  public Money calculateNoneDiscountedFee() {
    if (movieType != MovieType.NONE_DISCOUNT) {
      throw new IllegalArgumentException();
    }

    return fee;
  }

  public boolean isDiscountable(LocalDateTime whenScreened, int sequence) {
    for (DiscountCondition discountCondition : discountConditions) {
      if (discountCondition.getType() == DiscountConditionType.PERIOD) {
        if (discountCondition.isDiscountable(whenScreened.getDayOfWeek(), whenScreened.toLocalTime())) {
          return true;
        }
      } else {
        if (discountCondition.isDiscountable(sequence)) {
          return true;
        }
      }
    }

    return false;
  }

  public MovieType getMovieType() {
    return movieType;
  }
}
