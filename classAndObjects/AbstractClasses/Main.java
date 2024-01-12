abstract class Figure{
  double dim1;
  double dim2;
  Figure(int a,int b){
    dim1=a;
    dim2=b;
  }
  abstract double Area();
}
class Rect extends Figure{
  Rect(int a,int b){
    super(a,b);
  }
  double Area(){
    return dim1*dim2;
  }
}
class Tria extends Figure{
  Tria(int a,int b){
    super(a,b);
  }
  double Area(){
    return 0.5*dim1*dim2;
  }
}
public class Main {
  public static void main(String[] args) {
    Rect r = new Rect(4,5);
    Tria t = new Tria(4,6);
    Figure ref;
    ref = r;
    System.out.println("Area of the Rect: "+ref.Area());
    ref = t;
    System.out.println("Area of the Tria: "+ref.Area());
  }    
}
