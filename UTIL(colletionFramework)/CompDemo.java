import java.util.*;
public class CompDemo {
   public static void main(String[] args) {
   TreeSet<Integer> ts = new TreeSet<Integer>((a,b)->b.compareTo(a));
   ts.add(1);
   ts.add(2);
   ts.add(32);
   ts.add(2);
   ts.add(3);
   ts.add(4);
    for (Integer integer : ts)
       System.out.print(integer+" "); 
    System.out.println();
   } 
}
