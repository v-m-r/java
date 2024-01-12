public class NestedTC {
  public static void main(String[] args) {
    int a = 1;
    try {
      int b[] = new int[1];
      b[1] = 10;
      System.out.println(a/0);
      try {
        b[10000]= 10;
      }
      catch (Exception e) {
        System.out.println("Exception: "+e);
      }
    } catch (Exception e) {
      System.out.println("Excepiton: "+e);
    }
  }
}
