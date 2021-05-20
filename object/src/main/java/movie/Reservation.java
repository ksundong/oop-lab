package movie;

public class Reservation {

  private final Customer customer;
  private final Screening screening;
  private final Money money;
  private final int audienceCount;

  public Reservation(Customer customer, Screening screening, Money money, int audienceCount) {
    this.customer = customer;
    this.screening = screening;
    this.money = money;
    this.audienceCount = audienceCount;
  }
}
