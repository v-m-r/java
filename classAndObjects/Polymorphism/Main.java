class Figure{
  int dim1;
  int dim2;
  Figure(Figure obj){
    dim1 = obj.dim1;
    dim2 = obj.dim2;
  }
  Figure(int a,int b){
    dim1 = a;
    dim2 = b;
  }
  Figure(int a){
    dim1 = dim2 = a;
  }
  Figure(){
    dim1=dim2=1;
  }
  Double Area(){
    return dim1*dim2*1.0;
  }
}
class Rectangle extends Figure{
  Rectangle(int len,int w)
{
    super(len,w);
  }
  Double Area(){
    return dim1*dim2*1.0;
  }
}
class Circle extends Figure{
Circle (int rad){
    super(rad);
  }
  Double Area(){
    return dim1*dim1*3.14;
  }
}
class Triangle extends Figure{
  Triangle(int b,int h){
    super(b,h);
  }
  Double Area(){
    return dim1*dim2*0.5;
  }
}

public class Main {
  public static void main(String[] args) {
   Figure f = new Figure(10,5);
    Rectangle R = new Rectangle(13,3);
    Circle c = new Circle(5);
    Triangle t = new Triangle(5,6);
    Figure ref;
    ref = f;
    System.out.println(ref.Area());
    ref = R;
    System.out.println(ref.Area());
    ref = c;
    System.out.println(ref.Area());
    ref = t;
    System.out.println(ref.Area());
  }
}
