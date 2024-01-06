public class Main{
  public static void main(String arg[]){
    boolean b = true;
    int i = 0;
    do{
    if(i==10) 
    break;
    i++;
    if(i>3&&i<7)
    continue;
    System.out.println("Count :"+i);
    }while(i<15);
  }
}
