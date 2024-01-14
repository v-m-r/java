import java.io.*;
public class ShowFile {
  public static void main(String[] args) {
    int i;
    FileInputStream fin = null;
    if(args.length!=1){
      System.out.println("Usage: ShowFile filename");
      return;
    }
    try {
      fin = new FileInputStream(args[0]);
    } catch (Exception e) {
      System.out.println(e);
    }
    try{
      do{
        i = fin.read();
        System.out.print((char)i);
      }while(i!=-1);
    }
    catch(Exception e){
      System.out.println(e);
    }
    try {
      fin.close();
    } catch (Exception e) {
      System.out.println("File Not Closed");
    }
  }
}
