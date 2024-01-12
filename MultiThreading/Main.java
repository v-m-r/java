public class Main {
  public static void main(String[] args) {
    Thread t = Thread.currentThread();
    try{
      for (int i = 0; i < 5; i++) {
        System.out.println(i);
        Thread.sleep(1000);
      }
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
