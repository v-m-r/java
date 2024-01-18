class TwoGen<t,o>{
  t ob1;
  o ob2;
  TwoGen(t o,o o2){
    ob1 = o;
    ob2 = o2; 
  }
  t getValue1(){
    return ob1;
  }
  o getValue2(){
    return ob2;
  }
  void showType(){
  System.out.println("Object 1:"+ob1.getClass().getName()); 
  System.out.println("Object 2:"+ob2.getClass().getName()); 
  }
}
public class SimpGen {
  public static void main(String[] args) {
  TwoGen<Integer, String> a= new TwoGen<Integer,String>(10,"From two gen");
  a.showType();
  System.out.println("Values in TwoGen:"+a.getValue1());
  System.out.println("Values in TwoGen:"+a.getValue2());
  }
}
