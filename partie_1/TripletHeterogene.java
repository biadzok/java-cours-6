public class TripletHeterogene<T, U, V> {
  private T premier;
  private U second;
  private V troisieme;

  public TripletHeterogene() {};

  public TripletHeterogene(T premier, U second, V troisieme) {
    this.premier = premier;
    this.second = second;
    this.troisieme = troisieme;
  }

  public T getPremier() {
    return this.premier;
  }

  public U getSecond() {
    return this.second;
  }

  public V getTroisieme() {
    return this.troisieme;
  }
}