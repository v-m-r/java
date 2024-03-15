import java.util.StringTokenizer;

public class StringTknDemo {
    public static void main(String[] args) {
        String s = "hirred = joining;"+ "Interview = stage2;"+"Exam = Stage3;";
        StringTokenizer st = new StringTokenizer(s,"=;",true);
        StringTokenizer st1 = new StringTokenizer(s,";=");
        StringTokenizer st2 = new StringTokenizer(s);
        System.out.println("From Construct: st(str,delim,consdlim)");
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            str = str+st.nextToken();
            System.out.println(str);
        }
        System.out.println();
        System.out.println("From Construct: st(Str,delim)");
        while(st1.hasMoreTokens()){
            String str = st1.nextToken();
            str = str+st1.nextToken();
            System.out.println(str);
        }
        System.out.println();
        System.out.println("From Construct: st(str)");
        while(st2.hasMoreElements()){
            String token1 = st2.nextToken();
            System.out.println(token1);
        }
    }
}
