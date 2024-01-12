interface I1{
public  int meth1();
  public int meth2();
}
interface I2 extends I1{
  int meth3();
}
class temp implements I2 {
  public int meth1(){
    return 1;
  }
  public int meth2(){
    return 2;
  }
  public int meth3(){
    return 3;
  }
}
public class ExtInterface{
  public static void main(String[] args) {
    temp t = new temp();
    System.out.println(t.meth1()); 
    System.out.println(t.meth2()); 
    System.out.println(t.meth3()); 
  } 
}
