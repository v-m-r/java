import PackInter.*;
class Stack implements IntStack{
  private int stk[];
  private int tos;
  Stack(int size){
    stk = new int[size];
    tos  = -1;
  }
  public void push(int a){
    if(tos == stk.length-1){
      int temp [] = new int[stk.length*2];
      for(int i = 0;i<stk.length;i++)
      temp[i]=stk[i];
      stk = temp;
      stk[++tos] = a;
    }
    else
    stk[++tos] = a;
  }
  public int pop(){
    if(tos==-1)
    return -1;
    else
    return stk[tos--];
  }
}
public class DynStack {
  public static void main(String[] args) {
    Stack s = new Stack(10);
    for (int i = 0; i < 15; i++) {
      s.push(i+1); 
    }
      for (int i = 0; i < 9; i++) {
        System.out.println(s.pop());
      }
  }
}
