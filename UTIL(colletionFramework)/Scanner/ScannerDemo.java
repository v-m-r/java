import java.util.*;

public class ScannerDemo{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
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
        scr.close() ;
         System.out.format("Avg : "+(sum/count));
     }
  }
