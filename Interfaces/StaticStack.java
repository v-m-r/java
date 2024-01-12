import PackInter.*;
class Stck implements IntStack{
  private int elements[];
  private int tos;
  Stck(int a){
    elements = new int[a];
    tos = -1;
  }
 public void push(int a){
    if(tos == elements.length-1)
    return;
    else
    elements[++tos]=a;
  }
  public int pop(){
    if(tos == -1)
    return -1;
    else
    return elements[tos--];
  }
}
public class StaticStack {
  public static void main(String[] args) {
    Stck s = new Stck(10);
    for (int i = 0; i < 10; i++) {
      s.push(i+1);  
    }
    for (int i = 0; i < 15; i++) {
      System.out.println(s.pop());
    }
  }
}
