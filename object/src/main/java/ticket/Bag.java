package ticket;

public final class Bag {

  private Long amount;
  private final Invitation invitation;
  private Ticket ticket;

  public Bag(Invitation invitation) {
    this.invitation = invitation;
  }

  public boolean hasInvitation() {
    return invitation != null;
  }

  public boolean hasTicket() {
    return ticket != null;
  }

  public void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }

  public void minusAmount(Long amount) {
    this.amount -= amount;
  }

  public void plusAmount(Long amount) {
    this.amount += amount;
  }
}
