class MyException extends Exception{
  private int a;
  MyException(int b){
    b = a;
  }
  public String toString(){
    return "MyException: "+a;
  }
}
class DemoPro{
  public void demo(int a)throws MyException{
    if (a>10)
    throw new MyException(a);
  }
}
public class ExceptionDemo {
  public static void main(String[] args) {
    DemoPro d = new DemoPro();
    try{
      d.demo(11);
    }
    catch(Exception e){
      System.out.println("Exception :"+e);
    }
  }
}
