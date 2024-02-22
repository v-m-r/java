import java.io.*;
public class BRread {
  public static void main(String[] args) throws IOException {
    char c;
    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
    do{
    c = (char)b.read();
    System.out.println(c);
    }while(c != 'q');
  }
}
