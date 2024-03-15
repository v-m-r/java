import java.net.InetAddress;
import java.net.InetSocketAddress;

public class Main {
   public static void main(String[] args) throws Exception {
    InetAddress i = InetAddress.getLocalHost();
    System.out.println(i);
    i = InetAddress.getByName("google.com");
    System.out.println(i);
    InetAddress all[] = InetAddress.getAllByName("www.nba.com");
    for (InetAddress inetAddress : all) {
       System.out.println(inetAddress); 
    }
    byte buf[] = i.getAddress();
    for (int j = 0; j < buf.length; j++) {
        System.out.print(buf[j]+" ");
    }
    System.out.println();
   } 
}
