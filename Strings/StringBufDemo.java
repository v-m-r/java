public class StringBufDemo{
    public static void main(String arg[]){
        // String a = new String("Hyderabad");
        // a.charAt(Index)="i"; will result in error; cus string is immutableo.
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        sb.append(" This one after adding");
        System.out.println(sb+" ");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}