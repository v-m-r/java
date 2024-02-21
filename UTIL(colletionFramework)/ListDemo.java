import java.util.*;
import java.util.function.Consumer;
public class ListDemo {

   public static void main(String[] args) {
    Random r = new Random();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
        list.add(r.nextInt(10));
    }
    System.out.println("Size of the list: "+list.size());
    System.out.println("Elements of the List: "+list);
    ListIterator<Integer> i = list.listIterator();
   System.out.println("Elments using iterator: ");
    while(i.hasNext())
        System.out.print(i.next()+" ");
    System.out.println();
    while (i.hasPrevious()) 
       System.out.print(i.previous()+" "); 
    System.out.println();
    System.out.println("LinkedList");
    LinkedList<Integer> ll = new LinkedList<Integer>(list);
    System.out.println(ll);
    ll.addFirst(100);
    ll.offerFirst(101);
    System.out.println("After Adding: "+ll);
    int first,last;
    first = ll.peekFirst();
    last = ll.getLast();
    System.out.format("first: %d and last %d \n",first,last); 
    System.out.println("HashSets: ");
    HashSet<Integer> hs = new HashSet<Integer>(list);
    System.out.println("Elements in hashset:" +hs);
    LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(list);
    System.out.println("Elements in Linkedhashset:" +lhs);
    System.out.println("Treesets");
    TreeSet<Integer> t = new TreeSet<Integer>(list);
    System.out.println("Content of tree "+t);
   }
}
