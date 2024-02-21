import java.util.HashMap;

public class HashmapDemo {
public static void main(String[] args) {
    HashMap<Integer,Integer> hm = new HashMap<>();
    hm.put(1,1);
    hm.put(2,2);
    hm.put(3,4);
    hm.put(4, 5);
    System.out.println(hm.keySet());
    System.out.println(hm.values());
    for(int i:hm.keySet()){
        System.out.println(i+" ValueS "+hm.get(i));
    }
}
}