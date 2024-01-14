import java.lang.reflect.*;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle{
  int a();
}
public class Single{
  @MySingle(a=100)
  public static void myMeth() {
   Single obj = new Single();
    try {
    Method m = obj.getClass().getMethod("myMeth");
    MySingle a = m.getAnnotation(MySingle.class);
      System.out.println(a.a());
    } catch (Exception e) {
      System.out.println(e);
    }
  }
  public static void main(String[] args) {
    myMeth();
  }
}
