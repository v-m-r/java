import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois {
   public static void main(String[] args) {
    int c;
   try (Socket s = new Socket("whois.internic.net",43);
   FileOutputStream fout = new FileOutputStream("Whois.txt")) {
   InputStream in = s.getInputStream(); 
   OutputStream out = s.getOutputStream();
   String str = (args.length==0?"oracle.com":args[0])+"\n";
   byte buf[] = str.getBytes();
   out.write(buf);
   while((c = in.read())!=-1){
    fout.write(c);
   }
   } catch (Exception e) {
    System.out.print("unable to reach the host");
   } 
   } 
}
