class Q{
  int a;
  boolean valueSet = true;
  synchronized void put(int b){
    while(valueSet){
      try{
      wait();
      }
      catch(Exception e){
        System.out.println("Exception: "+e);
      }
    }
    a=b;
    valueSet = true;
    notify();
    System.out.println("Put : "+a);
  }
  synchronized int get(){
    while(!valueSet){
      try{
      wait();
      }
      catch(Exception e){
        System.out.println("Exception:"+e);
      }
    }
    valueSet= false;
    System.out.println("Get : "+a);
    notify();
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
public class PCFixed {
  public static void main(String[] args) {
    Q q = new Q();
    new Producer(q);
    new Consumer(q);
  }
}
