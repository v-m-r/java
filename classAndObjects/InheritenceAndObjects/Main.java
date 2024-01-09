class Box{
  int length;
  int breath;
  int heigth;
  Box(Box obj){
    length = obj.length;
    breath = obj.breath;
    heigth = obj.heigth;
  }
  Box(int len,int wid,int high){
    length = len;
    breath = wid;
    heigth = high;
  }
  Box(int sq){
    length = breath = heigth = sq;
  }
  Box(){
    length =breath=heigth=1;
  }
  int SurfaceArea(){
    return length*breath;
  }
  int vol(){
    return length*breath*heigth;
  }
}
class Weigth extends Box{
  int W;
  Weigth(Weigth obj){
    super(obj);
    W = obj.W;
  }
  Weigth(int l,int b,int h,int w){
    super(l,b,h);
    W = w;
  }
  Weigth(int l,int w){
    super(l);
    W = w;
  }
  int weigth(){
    return vol()*W;
  }
}
class Shipment extends Weigth{
  int cost;
  Shipment(Shipment obj){
    super(obj);
    cost = obj.cost;
  }
  Shipment(int l,int b,int h,int w,int perCost){
    super(l,b,h,w);
    cost = perCost;
  }
  Shipment(int l,int w,int perCost){
    super(l,w);
    cost = perCost;
  }
  int totalCost(){
    return cost*weigth();
  }
}
public class Main {
 public static void main(String[] args) {
  Shipment s1 = new Shipment(10,20,30,40,10);
  Shipment s2 = new Shipment(20,5,20);
    System.out.println("Vol of box1: "+s1.vol()+"\n"+"Vol of box2: "+s2.vol());
    System.out.println();
    System.out.println("Weigth of box1: "+s1.weigth()+"\n"+"Weight of box2: "+s2.weigth());
    System.out.println();
    System.out.println("Cost of box1: "+s1.totalCost()+"\n"+"Cost of box2: "+s2.totalCost());
 } 
}
