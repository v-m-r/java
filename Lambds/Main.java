interface Lambdas{
public void disp();
}

public class Main {
  public static void main(String[] args) {
    Lambdas l;
    l = ()-> System.out.println("Displayed using lamdas");
    l.disp();
  }
}
