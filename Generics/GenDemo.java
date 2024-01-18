class Gen<T>{
  T ob;
  Gen(T o){
    ob = o;
  }
  T getOb(){
    return ob;
  }
  void showType(){
    System.out.println("Type of the generics: "+ob.getClass().getName());
  }
}
public class GenDemo {
  public static void main(String[] args) {
    Gen<Integer> i = new Gen<Integer>(35);
    i.showType();
    System.out.println("Value of ob:"+i.getOb());
    Gen<String> s = new Gen<String>("This string is from gen");
    s.showType();
    System.out.println("Value of ob:"+s.getOb());
  }
}
