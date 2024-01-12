public class DemoJoin {
  public static void main(String[] args) {
    NewThread obj1 = new NewThread("One");
    NewThread obj2 = new NewThread("Two");
    NewThread obj3 = new NewThread("Three");
    System.out.println("Thread one Status: "+obj1.t.isAlive());
    System.out.println("Thread two Status: "+obj2.t.isAlive());
    System.out.println("Thread three Status: "+obj3.t.isAlive());
    try{
    System.out.println("Waiting for threads to Exit");
    obj1.t.join();
    obj2.t.join();
    obj3.t.join();
    }
    catch(Exception e){
      System.out.println("Exception :"+e);
    }
    System.out.println("Thread one Status: "+obj1.t.isAlive());
    System.out.println("Thread two Status: "+obj2.t.isAlive());
    System.out.println("Thread three Status: "+obj3.t.isAlive());
  }
} 
