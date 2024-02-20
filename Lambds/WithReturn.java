interface Returns{
  public String Disp(String s);
}

public class WithReturn {
  public static void main(String[] args) {
   Returns r;
    r = (s)-> "Lambda with :" + s;

  System.out.println(r.Disp("Returns"));

  }
}
