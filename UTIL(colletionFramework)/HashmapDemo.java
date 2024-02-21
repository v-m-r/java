import java.util.*;

public class HashmapDemo {
public static void main(String[] args) {
    HashMap<Integer,Integer> hm = new HashMap<>();
    hm.put(1,1);
    hm.put(2,2);
    hm.put(3,4);
    hm.put(4,5);
    Set<Map.Entry<Integer,Integer>> set = hm.entrySet();
    for(Map.Entry<Integer,Integer> b: set){
        System.out.print(b.getKey()+" : ");
        System.out.println(b.getValue()); 
    }
    hm.put(1, 12);
    System.out.println("1's val : "+hm.get(1));
}
}