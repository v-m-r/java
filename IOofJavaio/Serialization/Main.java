import java.io.*;

public class Main {
   public static void main(String[] args) {
   try (ObjectOutputStream opst = new ObjectOutputStream(new FileOutputStream("Serial.txt"))) {
   MyClass obj = new MyClass("Mani", 13, 14.144);
    opst.writeObject(obj);
   System.out.println("Myclass obj Write: "+ obj);
   } catch (Exception e) {
    System.out.println("If error Occur: "+ e);
   }
   try (ObjectInputStream opst = new ObjectInputStream(new FileInputStream("Serial.txt")))
    {
   MyClass obj2 = (MyClass)opst.readObject(); 
   System.out.println("Myclass obj read: "+ obj2);
   } catch (Exception e) {
    System.out.println("Error: "+e);
   } 
   } 
}
class MyClass implements Serializable{
    String name;
    int num;
    double dec;
    public MyClass(String s,int a,double b){
        name = s;
        num = a;
        dec = b;
    }
    @Override
    public String toString() {
        return "MyClass [name=" + name + ", num=" + num + ", dec=" + dec + "]";
    }

}
    
