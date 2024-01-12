public class MultiThreadDemo {
  public static void main(String[] args) {
    new NewThread("One");
    new NewThread("Two");
    new NewThread("Three");
    Thread t = Thread.currentThread();
    try {
      for (int i = 0; i < 5; i++) {
        System.out.println("Main: "+(i+1));
        Thread.sleep(1000);
      }
    } catch (Exception e) {
      System.out.println("Exception: "+e);
    }
  }
}
