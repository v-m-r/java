import java.io.*;
class NewThread implements Runnable{
  private String file;
  private Thread t;
  private FileInputStream fin;
  NewThread(String file,String name){
    this.file = file;
    t = new Thread(this,name);
    t.start();
  }
  public void run(){
  int i;
    if(file==null)
      return;
    try{
    fin = new FileInputStream(file);
    }
    catch(Exception e){
      System.out.println("Exp :"+e);
    }
    try{
    do{
    i = fin.read();
    if(i!=-1)
     System.out.print((char)i); 
        try {
          Thread.sleep(1000);
        } catch (Exception e) {
          System.out.println(e);
        }
    }while(i!=-1);
    }
    catch(Exception e){
      System.out.println("Exp :"+e);
    }
    try {
      fin.close();
    } catch (Exception e) {
      System.out.println("File is not closing");
    }
  }
}
public class Main {
  public static void main(String[] args) {
    NewThread obj1 = new NewThread(args[0],"File1");
    NewThread obj2 = new NewThread(args[1],"File2");
  }
}
