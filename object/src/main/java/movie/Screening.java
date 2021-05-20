package movie;

import java.time.LocalDateTime;

public final class Screening {

  private final Movie movie;
  private final int sequence;
  private final LocalDateTime whenScreened;

  public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
    this.movie = movie;
    this.sequence = sequence;
    this.whenScreened = whenScreened;
  }

  public Reservation reserve(Customer customer, int audienceCount) {
    return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
  }

  private Money calculateFee(int audienceCount) {
    return movie.calculateMovieFee(this).times(audienceCount);
  }

  public Movie getMovie() {
    return movie;
  }

  public int getSequence() {
    return sequence;
  }

  public LocalDateTime getWhenScreened() {
    return whenScreened;
  }

  public boolean isSequence(int sequence) {
    return this.sequence == sequence;
  }

  public LocalDateTime getStartTime() {
    return whenScreened;
  }

  public Money getMovieFee() {
    return movie.getFee();
  }
}
