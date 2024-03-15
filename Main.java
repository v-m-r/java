public class Main{
    static String IsPalin(String s){
        for( int i=0,j=s.length()-1;i<=j;i++,j--){
            if(s.charAt(i)!=s.charAt(j))
            return " Is not a plaindrome";
        }
        return " Is a palindrome";
    }
    public static void main(String[] args) {
    String arr[]= {"peep", "deed", "not","cat"}; 
    for (String string : arr) {
    System.out.println(IsPalin(string));    
    }
    }
}