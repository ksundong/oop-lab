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

  public void minusAmount(Long amount) {
    this.amount -= amount;
  }

  public void sellTicketTo(Audience audience) {
    plusAmount(audience.buy(getTicket()));
  }

  private Ticket getTicket() {
    return tickets.remove(0);
  }

  private void plusAmount(Long amount) {
    this.amount += amount;
  }
}
