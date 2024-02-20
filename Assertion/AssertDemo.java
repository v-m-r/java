public class AssertDemo {
  static int val = 3;
  static int GetNum(){
    return (val--);
  }
  public static void main(String[] args) {
    int num;
    for (int i = 0; i < 100; i++) {
      num = GetNum();
      assert (num > 0);
      System.out.println("I = "+num);
    }
  }
}
