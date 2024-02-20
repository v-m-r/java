public class The {
  public static void main(String[] args) {
    int i;
    String org = "This is class, this is too";
    String search = "is";
    String sub = "was";
    String res ="";
    do{
        System.out.println(org);
      i= org.indexOf(search);
      if(i!=-1){
        res = org.substring(0,i);
        res = res + sub;
        res = res + org.substring(i+sub.length()); 
        org = res;
      }
    }while(i!=-1);
  }
}
