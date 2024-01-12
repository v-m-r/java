class NewThread implements Runnable{
  Thread t;
String Name;
  NewThread(String name){
    Name = name;
    t = new Thread(this,Name);
    t.start();
  }
  public void run(){
    try{
    for (int i = 0; i < 5; i++) {
      System.out.println(Name+" :"+(i+1));
      Thread.sleep(1000);
    }
    }
    catch(Exception e){
      System.out.println("Excetion: "+e);
    }
  }

}
public class ThreadDemo {
  public static void main(String[] args) {
    new NewThread("Demo");
    Thread t= Thread.currentThread();
    try{
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
      Thread.sleep(1000);
    }
    }
    catch(Exception e){
      System.out.println("Exception: "+e);
    }
  }
}
