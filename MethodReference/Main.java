interface foo{
  public String meth(String s);
}
class Action{
  static String outs(String str){
    String res = "";
    for (int  i = str.length() -1; i >=0; i--) {
     res += str.charAt(i);
    }
    return res;
  }
}

public class Main {
  static String strOp(foo f, String str){
  return f.meth(str);
  }
  public static void main(String[] args) {
    String ins = "This string is in java";
    String outp = "";
    outp = strOp(Action::outs,ins);
    System.out.println(outp);
  }
}
