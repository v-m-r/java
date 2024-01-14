class process{
  public void show(int a) throws MyException{
    if(a>10){    
      MyException e = new MyException(a);
      e.initCause( new ArithmeticException("Demo"));
      throw e;
    }
  }
}
public class ChainExeDemo {
  public static void main(String[] args) {
    int a = 13;
    process p = new process();
    try{
      p.show(a);
    }
    catch(Exception e){
      System.out.println("Exception: "+e);
      System.out.println("Cause: "+e.getCause());
    }
  }
}
