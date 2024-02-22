import java.util.*;
import java.io.*;
public class FileScanner {
    public static void main(String[] args) throws Exception{
       FileWriter fout = new FileWriter("Text.txt");
       fout.write("1 2 4 55 6 6 done"); 
       fout.close();
       FileInputStream fin = new FileInputStream("Text.txt");
       Scanner scr = new Scanner(fin);
       int sum = 0, count = 0;
        while (scr.hasNext()) {
            if (scr.hasNextInt()) {
                sum += scr.nextInt();
                count++;
            } else {
                String str;
                if (scr.hasNextLine()) {
                    str = scr.nextLine();
                    if (str.equals("done"))
                        break;
                } else
                    return;
            }
        }
        scr.close();
        System.out.format("Avg : "+(sum/count));
    }
}