import java.util.*;

class MyComp implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){
        int i,j,k;
        i = s1.lastIndexOf(" ");
        j = s2.lastIndexOf(" ");
        k = s2.substring(j).compareToIgnoreCase(s1.substring(i));
        if(k==0)
        return s2.compareTo(s1);
        else
        return k;
    }
}
public class TreeMapDemo {
   public static void main(String[] args) {
    TreeMap<String,Integer> tm= new TreeMap<>(new MyComp());
    tm.put("Mani Deep",123);
    tm.put("Naveen yadav",231);
    tm.put("Sundip Kishan",342);
    tm.put("Nagarjun pm",113);
    Set<Map.Entry<String,Integer>> set = tm.entrySet();
    for(Map.Entry<String,Integer> i : set)
        System.out.println(i.getKey()+": "+i.getValue());
   tm.put("Mani Deep",222);
   } 
}
