
import java.io.*;
public class CopyFile{
  public static void main(String[] args) {
    int i;
    FileInputStream fin = null;
    FileOutputStream fout = null;
    if(args.length!=2){
      System.out.println("Usage: ShowFile filename");
      return;
    }
    try {
      fin = new FileInputStream(args[0]);
      fout = new FileOutputStream(args[1]);
    } catch (Exception e) {
      System.out.println(e);
    }
    try{
      do{
        i = fin.read();
        if(i!=-1)fout.write(i);
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
    try {
      fout.close();
    } catch (Exception e) {
      System.out.println("File Not Closed");
    }
  }
}
