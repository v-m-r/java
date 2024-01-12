public class ThrowDemo {
  static void trow() throws IllegalAccessException{
    System.out.println("Inside the Error");
    throw new IllegalAccessException("Demo");
  }
  public static void main(String[] args) {
    try{
    trow();
    }
    catch(Exception e){
      System.out.println("Exeption: "+e);
    }
  }
}
