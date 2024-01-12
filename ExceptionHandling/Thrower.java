class DemoEr{
  void Demo(){
    try{
    throw new NullPointerException("Demo");
    }
    catch(Exception e){
      System.out.println("Exception cought");
      throw e;
    }
  }
}
public class Thrower {
  public static void main(String[] args) {
  DemoEr d = new DemoEr();
    try{
    d.Demo();
    }
    catch(Exception e){
    System.out.println("Exception: "+e);
    }
  }
}
