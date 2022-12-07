class Main {
  public static void main(String[] args) {
    Triplet<Integer> triplet = new Triplet(1, 2, 3);
    System.out.println(triplet.getPremier());
    System.out.println(triplet.getSecond());
    System.out.println(triplet.getTroisieme());

    Triplet<Integer> triplet2 = new Triplet("1.2a3", "2.3aa4", "3.4aaa5");
    System.out.println(triplet2.getPremier());
    System.out.println(triplet2.getSecond());
    System.out.println(triplet2.getTroisieme());

    Triplet<Integer> triplethetero = new Triplet(1.23, 2, "3.4aaa5");
    System.out.println(triplethetero.getPremier());
    System.out.println(triplethetero.getSecond());
    System.out.println(triplethetero.getTroisieme() + "\n\n\n");

    
  }
}