import java.io.*;
public class ShowFile {
  public static void main(String[] args) {
    int i;
    if(args.length!=1){
      System.out.println("Usage: ShowFile filename");
      return;
    }
    try(FileInputStream fin = new FileInputStream(args[0])){
      do{
        i = fin.read();
        System.out.print((char)i);
      }while(i!=-1);
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
