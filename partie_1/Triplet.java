public class Triplet<T> {
  private T premier;
  private T second;
  private T troisieme;

  public Triplet() {};

  public Triplet(T premier, T second, T troisieme) {
    this.premier = premier;
    this.second = second;
    this.troisieme = troisieme;
  }

  public T getPremier() {
    return this.premier;
  }

  public T getSecond() {
    return this.second;
  }

  public T getTroisieme() {
    return this.troisieme;
  }
}