import java.io.*;
import java.util.*;

public class Phonebook {
    public static void main(String[] args) throws IOException{
        Properties p = new Properties();
        String name, number;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fin = null;
        boolean changed = false;
        try {
            fin = new FileInputStream("Data.dat");
        } catch (Exception e) {
            System.out.println("File not Found");
        }
        try {
            if (fin != null) {
                p.load(fin);
                fin.close();
            }
        } 
        catch (Exception e) {
            System.out.println("File is not Loadead");
        }
        do {
            System.out.println("Enter the name:(quit to exit) ");
            name = br.readLine();
            if (name.equals("quit"))
            continue;
            System.out.println("Enter Number: ");
            number = br.readLine();
            p.setProperty(name, number);
            changed = true;
        } while (!name.equals("quit"));
        if (changed) {
            FileOutputStream fout = new FileOutputStream("Data.dat");
            p.store(fout, "Telephone book");
            fout.close();
        }
        do {
            System.out.println("Enter the name to find Number: ");
            name = br.readLine();
            if (name.equals("quit"))
            continue;
            System.out.println("Number is: " + p.getProperty(name));
        } while (!name.equals("quit"));
    }
}
