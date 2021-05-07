package ticket;

import java.util.Arrays;
import java.util.List;

public final class TicketOffice {

  private Long amount;
  private final List<Ticket> tickets;

  public TicketOffice(Long amount, Ticket... tickets) {
    this.amount = amount;
    this.tickets = Arrays.asList(tickets);
  }

  public Ticket getTicket() {
    return tickets.remove(0);
  }

  public void minusAmount(Long amount) {
    this.amount -= amount;
  }

  public void plusAmount(Long amount) {
    this.amount += amount;
  }
}
