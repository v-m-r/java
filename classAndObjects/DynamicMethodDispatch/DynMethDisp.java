class A{
A(){
    System.out.println("From class A");
  }
  void Show(){
    System.out.println("it Show from class A");
  }
}
class B extends A{
B(){
System.out.println("From class B");
}
  void Show(){
    System.out.println("it Show from class B");
  }
}
class C extends B{
  C(){
    System.out.println("From class c");
  }
  void Show(){
    System.out.println("it Show from class c");
  }

}
public class DynMethDisp {
  public static void main(String[] args) 
  {
  C c = new C();
    c.Show();//The method will be taken from last overidden class
  A a= new A();
    a.Show();
  B b= new B();
    b.Show();
    c.Show();
  }
}
