public class Second {
  public static void main(String[] args) {
    try {
      First c1 = new First(5);
      First c2 = new First(-5);
      First c3 = new First(0);
    }
    catch (IllegalArgumentException ex) {
      System.out.println(ex);
    }

    System.out.println("Number of objects created: " +
    		First.getNumberOfObjects());
  }
}