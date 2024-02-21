public class ArrayCp {
   public static void main(String arg[]){
    int a[] = {1,2,3,4,5,6,7};
    int b[] = {7,6,5,4,3,2,1};
    System.arraycopy(a, 0, b, 0, a.length);
    System.arraycopy(b, 0, a, 0, b.length);
    for (int i : a)   
    System.out.print(i+" ");
    System.out.println();
    for (int i : b)   
    System.out.print(i+" ");
    System.out.println();
    System.arraycopy(a, 1, a, 0, a.length-1);
    System.arraycopy(b, 1, b, 0, b.length-1);
    for (int i : a)   
    System.out.print(i+" ");
    System.out.println();
    for (int i : b)   
    System.out.print(i+" ");
    System.out.println();
   } 
}

