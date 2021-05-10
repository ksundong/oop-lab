package ticket;

public final class Audience {

  private final Bag bag;

  public Audience(Bag bag) {
    this.bag = bag;
  }

  public Long buy(Ticket ticket) {
    if (bag.hasInvitation()) { // oh no
      bag.setTicket(ticket);
      return 0L;
    } else { // oh no
      bag.setTicket(ticket);
      bag.minusAmount(ticket.getFee());
      return ticket.getFee();
    }
  }
}
