public class StringJoinDemo {
    public static void main(String arg[]){
    String s = String.join(", ", "Hi","My Name is ","Manideep");
    System.out.println(s);
    s = "      "+s;
    System.out.println(s);
    
    System.out.println(s.stripLeading());
}
}
