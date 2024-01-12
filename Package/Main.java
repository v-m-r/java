import MyPack.*;

public class Main {
  public static void main(String[] args) {
  Room r = new Room(5);
  for (int i = 0; i < 5; i++) 
  r.setter(i,"Member: "+i); 
  r.setter(10,"Member: "+10);
  System.out.println(r.getter(1));
  System.out.println(r.getter(2));
  System.out.println(r.getter(3));
  System.out.println(r.getter(10));
  }
}
