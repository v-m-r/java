class Gen<T>{
  T o;
  Gen(T ob){
    o = ob;
  }
  T getValue(){
    return o;
  }
  void showType(){
    System.out.println("Type of ob:"+o.getClass().getName());
  }
}
public class GenDemo {
  public static void main(String[] args) {
  Gen<Integer> i = new Gen<Integer>(10);
  i.showType();
  System.out.println(i.getValue());
  Gen<String> s = new Gen<String>("This string is from gen");
  s.showType();
  System.out.println(s.getValue());
  }
}
