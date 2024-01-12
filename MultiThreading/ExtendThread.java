class NewThread extends Thread{
  NewThread(String Name){
    super(Name);
    System.out.println("Thread name");
    start();
  }
  public void run(){
    try{
      for (int i = 0; i < 5; i++) {
        System.out.println("Child Thread: "+i);
        Thread.sleep(1000);
      }
    }
    catch(Exception e){
      System.out.println("Exception e"+ e);
    }
  }
}
public class ExtendThread {
  public static void main(String[] args) {
    new NewThread("Demo");
    Thread t = Thread.currentThread();
    try {
      for (int i = 0; i < 5; i++) {
        System.out.println("Main thread: "+(i+1));
        Thread.sleep(1000);
      }
    } catch (Exception e) {
      System.out.println(e);//TODO: handle exception
    }
  }
}
