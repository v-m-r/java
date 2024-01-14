class NewThread implements Runnable{
  boolean susflag;
  Thread t;
  NewThread(String name){
    t = new Thread(this,name);
    t.start();
    susflag = false;
  }
  public void run(){
    try{
    for (int i = 0; i < 10; i++) {
      Thread.sleep(1500);
      System.out.println("The value of i "+t.getName()+" "+i);
        synchronized(this){
      while(susflag){
          wait();
        }
        }
    }
    }
    catch(Exception e){
      System.out.println("Eror: "+e);
    }
  }
  void suspend(){
  susflag = true;
  }
  void resume(){
    susflag = false;
    notify();
  }
}
public class SuspendResume {
  public static void main(String[] args) {
    NewThread obj1= new NewThread("One");
    NewThread obj2= new NewThread("Two");
   try{
    obj1.suspend();
    System.out.println("Suspending Thread: "+obj1.t.getName());
    Thread.sleep(1500);
    obj1.resume();
    System.out.println("Resuming Thread: "+obj1.t.getName());
    obj2.suspend();
    System.out.println("Suspending Thread: "+obj2.t.getName());
    Thread.sleep(2000);
    obj2.resume();
    System.out.println("Resuming Thread: "+obj2.t.getName());
   }
    catch(Exception e){
      System.out.println("Exception: "+e);
    }
    try {
      System.out.println("Waiting to Exit");
      obj1.t.join();
      obj2.t.join();
    } catch (Exception e) {
      System.out.println("Exception: "+e);
    }
    System.out.println("Main.Thread exit");
  }
}
