public class Recursion {
  static int fact(int a){
    if(a==1) return 1;
    return a*fact(a-1);
  }
  public static void main(String[] args) {
  int a = 5;
    System.out.println(fact(a)+"");
  }
}
