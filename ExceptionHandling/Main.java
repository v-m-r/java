public class Main {
  public static void main(String[] args) {
    int a= 1;
    try{
    System.out.println(a/0);
    }
    catch(Exception e){
      System.out.println("Exception: "+e);
    }
  }
}
