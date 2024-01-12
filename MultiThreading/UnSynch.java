
class callme{
  void call(String msg){
    System.out.print("["+msg);
    try {
      Thread.sleep(1000);
    } catch (Exception e) {
      System.out.println("Exception: "+e);
    }
    System.out.println("]");
  }
}
class caller implements Runnable{
  String msg;
  callme target;
  Thread t;
  caller(callme targ, String m){
    target = targ;
    msg = m;
    t = new Thread(this);
    t.start();
  }
  public void run(){
    target.call(msg);
  }

}
public class UnSynch {
  public static void main(String[] args) {
    callme c = new callme();
    caller obj1= new caller(c,"object 1");
    caller obj2= new caller(c,"object 2");
    caller obj3= new caller(c,"object 3");
    try{
      obj1.t.join();
      obj2.t.join();
      obj3.t.join();
    }
    catch(Exception e){
      System.out.println("Exception: "+e);
    } }
}
