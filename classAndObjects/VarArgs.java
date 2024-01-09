public class VarArgs {
  static void Disp(int ...x){
  for(int i : x)
    System.out.print(i+" ");
  System.out.println();
  }
  public static void main(String[] args) {
    int n[] = {1,2,3,4};
    int o[] = {5,6,7};
    int p[] = {7,9,0};
    Disp(n);
    Disp(o);
    Disp(p);
    Disp(1,2,3,4,5,6);
  }
}
