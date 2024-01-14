import java.lang.reflect.*;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
  String str();
  int a();
}
public class Main {
  @MyAnno(str="MyAnnotation",a=10)
  public static void myMeth(int ex,int d) {
  Main obj = new Main();
    try {
   Class <?> c =  obj.getClass();
    Method m = c.getMethod("myMeth",int.class,int.class);
    MyAnno b = m.getAnnotation(MyAnno.class);
    System.out.println(b.str()+" "+b.a());
    } catch (Exception e) {
      System.out.println("Exception: "+e);
    }
  }
  public static void main(String[] args) {
    myMeth(1,2);
  }
}
