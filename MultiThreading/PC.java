class Q{
  int a;
  synchronized void put(int b){
    a=b;
    System.out.println("Put : "+a);
  }
  synchronized int get(){
    System.out.println("Get : "+a);
    return a;
  }
}
class Producer implements Runnable{
  Q q;
  Producer(Q q){
    this.q = q;
    new Thread(this,"Producer").start();
  }
  public void run(){
    int i=0;
    while(true)
    q.put(i++);
  }
}
class Consumer implements Runnable{
  Q q;
  Consumer(Q q){
    this.q = q;
    new Thread(this,"Consumer").start();
  }
  public void run(){
    while(true)
    q.get();
  }
}
public class PC {
  public static void main(String[] args) {
    Q q = new Q();
    new Producer(q);
    new Consumer(q);
    try {
      Thread.sleep(1000);
    } catch (Exception e) {
      System.out.println("Exception: "+e);
    }
  }
}
