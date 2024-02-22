import java.util.StringTokenizer;

public class StringTknDemo {
    public static void main(String[] args) {
        String s = "hirred = joining;"+ "Interview = stage2;"+"Exam = Stage3;";
        StringTokenizer st = new StringTokenizer(s,"=;");
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            str = str+st.nextToken();
            System.out.println(str);
        }
    }
}
