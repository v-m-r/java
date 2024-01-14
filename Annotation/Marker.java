import java.lang.reflect.*;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker{}
public class Marker {
  @MyMarker
  public static void myMeth() {
    Marker obj = new Marker();
    try{
    Method m = obj.getClass().getMethod("myMeth"); 
  if(m.isAnnotationPresent(MyMarker.class)){
  System.out.println("Marker is present");
  }
  }
  catch(Exception e){
  System.out.println("Exception: "+e);
  }
  }
  public static void main(String[] args) {
    myMeth(); 
  }
}
