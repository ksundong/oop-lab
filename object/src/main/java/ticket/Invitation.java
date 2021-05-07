package ticket;

import java.time.LocalDateTime;

public final class Invitation {

  private final LocalDateTime when;

  public Invitation(LocalDateTime when) {
    this.when = when;
  }
}
