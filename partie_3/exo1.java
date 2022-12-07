import java.util.Random;

public class exo1<T> {
  public static <T> T methode1(T[] input) {
    Random random = new Random();
    return input[random.nextInt() % input.length];
  }
}