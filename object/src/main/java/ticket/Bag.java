package ticket;

public final class Bag {

  private Long amount;
  private final Invitation invitation;
  private Ticket ticket;

  public Bag(Long amount) {
    this(null, amount);
  }

  public Bag(Invitation invitation, long amount) {
    this.amount = amount;
    this.invitation = invitation;
  }

  public boolean hasTicket() {
    return ticket != null;
  }

  public void plusAmount(Long amount) {
    this.amount += amount;
  }

  public Long hold(Ticket ticket) {
    if (hasInvitation()) { // oh no
      setTicket(ticket);
      return 0L;
    } else { // oh no
      setTicket(ticket);
      minusAmount(ticket.getFee());
      return ticket.getFee();
    }
  }

  private boolean hasInvitation() {
    return invitation != null;
  }

  private void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }

  private void minusAmount(Long amount) {
    this.amount -= amount;
  }
}
