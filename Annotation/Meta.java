import java.lang.reflect.*;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
  String str();
  int a();
}
@Retention(RetentionPolicy.RUNTIME)
@interface What{
  int el();
}
@MyAnno(str="ClassAnno",a=50)
@What(el = 10)
public class Meta{
  @MyAnno(str="MyAnnotation",a=10)
  @What(el = 50)
  public static void myMeth() {
    Meta obj = new Meta();
    try {
      Annotation anno[] = obj.getClass().getAnnotations();
      for (Annotation a : anno) 
      System.out.println(a);
       anno = obj.getClass().getMethod("myMeth").getAnnotations();
      for (Annotation a : anno) 
      System.out.println(a);
    }
    catch (Exception e) {
      System.out.println("Exception: "+e);
    }

  }
  public static void main(String[] args) {
    myMeth();
  }
}
