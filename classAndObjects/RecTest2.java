class Rec{
  int arr[];
  Rec(int i){
    arr = new int[i];
  }
  void PrintArray(int i){
    if (i==0)return;
    else PrintArray(i-1);
    System.out.println(arr[i-1]);
  }
}
public class RecTest2 {
  public static void main(String[] args) {
    Rec obj = new Rec(10);
    for (int i = 0; i < 10; i++) {
      obj.arr[i] = i+1;
    }
    obj.PrintArray(10);
  }
}
