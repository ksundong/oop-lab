package movie;

public abstract class DiscountPolicy {

  public abstract Money calculateDiscountAmount(Screening screening);
}
