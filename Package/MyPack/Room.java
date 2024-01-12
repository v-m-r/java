package MyPack;
public class Room {
  int count;
  String mem[];
  public Room(int a){
    count = a;
    mem = new String[a];
  }
  public String getter(int id){
    if (id > count)
    return null;
    else
    return mem[id];
  }
  public void setter(int id,String name){
    if (count < id)
    System.out.println("No members Allowed");
    else
    mem[id] = name; 
  }
}
