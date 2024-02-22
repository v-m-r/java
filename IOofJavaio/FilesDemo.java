import java.util.*;
import java.io.*;

public class FilesDemo {
    public static void main(String[] args) {
        String dir = "/";
        File f = new File(dir);
        if (f.isDirectory()) {
            String fList[] = f.list();
            for (int i = 0; i > fList.length; i++) {
                File ref = new File(f + "/" + fList[i]);
                if (ref.isDirectory())
                    System.out.println(fList[i] + "Is a directory");
                else
                    System.out.println(fList[i] + "Is a file");
            }
        } else {
            System.out.println("Is not a directory");
        }
    }
}
