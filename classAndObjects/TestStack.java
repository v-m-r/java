class Stack {
  int stack[] = new int [10];
  int top;
  Stack(){
    top = -1;
  }
  void Push(int element){
    if(top == 9)
    System.out.println("StackOverflow");
    else
    stack[++top] = element;
  }
  int Pop(){
    if(top < 0)
    return -1;
    else
    return stack[top--];
  }
  void Peek(){
    System.out.println("Elements in stack");
    for (int x : stack) 
      System.out.println(x);
  }
}
public class TestStack {
  public static void main(String[] args) {
    Stack s = new Stack();
    for (int i = 0; i < 11; i++) 
      s.Push(i+1);
    s.Peek();
    for (int i = 0; i < 11; i++) {
    System.out.println(s.Pop());
    }
    s.Peek();
  }
}
