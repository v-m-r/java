interface Params{
  public void disp(String s);
}

public class WithParams {
  public static void main(String[] args) {
    
    Params p;
    p = (s) -> System.out.println("Hi with:"+ s);
    p.disp("Params");
  }
}
