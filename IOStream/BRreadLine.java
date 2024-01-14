import java.io.*;
public class BRreadLine {
  public static void main(String[] args) throws IOException {
    String c;
    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
    do{
    c = b.readLine();
    System.out.println(c);
    }while(!c.equals("stop"));
  }
}
