package datadriventicket;

import java.time.Duration;
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

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Duration getDuration() {
    return duration;
  }

  public void setDuration(Duration duration) {
    this.duration = duration;
  }

  public Money getFee() {
    return fee;
  }

  public void setFee(Money fee) {
    this.fee = fee;
  }

  public List<DiscountCondition> getDiscountConditions() {
    return discountConditions;
  }

  public void setDiscountConditions(List<DiscountCondition> discountConditions) {
    this.discountConditions = discountConditions;
  }

  public MovieType getMovieType() {
    return movieType;
  }

  public void setMovieType(MovieType movieType) {
    this.movieType = movieType;
  }

  public Money getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(Money discountAmount) {
    this.discountAmount = discountAmount;
  }

  public double getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscountPercent(double discountPercent) {
    this.discountPercent = discountPercent;
  }
}
