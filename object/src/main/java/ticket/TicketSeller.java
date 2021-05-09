package ticket;

public final class TicketSeller {

  private final TicketOffice ticketOffice;

  public TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }

  public void sellTo(Audience audience) {
    if (audience.getBag().hasInvitation()) { // oh no
      Ticket ticket = ticketOffice.getTicket();
      audience.getBag().setTicket(ticket);
    } else { // oh no
      Ticket ticket = ticketOffice.getTicket();
      audience.getBag().minusAmount(ticket.getFee());
      ticketOffice.plusAmount(ticket.getFee());
      audience.getBag().setTicket(ticket);
    }
  }
}
