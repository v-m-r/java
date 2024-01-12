interface constant{
  int a = 1;
  int b = 2;
  int c = 3;
  int d = 4;
}
class Prints implements constant{
  void Rets(int ch){
    switch (ch) {
      case a:
      System.out.println("You selected one");
      break;
      case b:
      System.out.println("You selected two");
      break;
      case c:
      System.out.println("You selected three");
      break;
      case d:
      System.out.println("You selected four");
      default:
      System.out.println("Not valid");
      break;
    }
  }
}
public class Main{
  public static void main(String[] args) {
    Prints p = new Prints();
    p.Rets(1);
    p.Rets(2);
    p.Rets(3);
    p.Rets(4);
    p.Rets(5);
  }
}
