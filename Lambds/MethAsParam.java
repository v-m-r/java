interface Meth{
  public String asRef(String s);
}
class toRef{
  String does(Meth r,String is){
    return r.asRef(is);
  }
}
public class MethAsParam {
  public static void main(String[] args) {
    toRef t = new toRef();
    String str = "This will be displayed when the method is called";
    System.out.println(t.does((s)-> s,str));
  } 
}
