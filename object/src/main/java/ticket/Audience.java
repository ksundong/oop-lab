package ticket;

public final class Audience {

  private final Bag bag;

  public Audience(Bag bag) {
    this.bag = bag;
  }

  public Bag getBag() {
    return bag;
  }
}
