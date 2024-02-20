public class Main {
  static String data[] = {
    "Now", "is", "the", "time", "for", "all", "good", "men",
    "to", "come", "to", "the", "aid", "of", "their", "country"
  };
  public static void main(String[] args) {
    // Converting byte array into string  
    byte arr[] = {65,66,67,68,69};
    String s = new String(arr);
    System.out.println(s);
    s = new String(arr,0,4);
    System.out.println(s);
    s = "Hello this is my PC";
    char arr2[]= new char[10];
    s.getChars(0,4,arr2,0);
    for(char i : arr2)
    System.out.print(i);
    System.out.println();
    System.out.println(Ops("Hello","Hello"));
    System.out.println(caseOps("Hello","HELLO"));
    System.out.println(regMatch("Hello","HELLO"));
    System.out.println(regMatchIgCase("Hello","HELLO"));
    System.out.println("Might".startsWith("Mi"));
    System.out.println("Might".endsWith("HT")+" Next");
    String s1 = new String("Hello");
    System.out.println("Hello"==s1);
    System.out.println(Ops("Hello",s1));
    Sort();
    for (String  i : data) {
      System.out.print(i+" "); 
    }
    System.out.println();
    System.out.println("Hello Hell Why the Hell".indexOf("Hell",2));
    System.out.println("That is why".substring(0,4));
    System.out.println(repl("the the the the"));
  }
  public static boolean Ops(String a,String b){
    return a.equals(b);
  }
  public static boolean caseOps(String a,String b){
    return a.equalsIgnoreCase(b);
  }
  public static boolean regMatch(String a,String b){
    return a.regionMatches(2,b,2,3);
  }
  public static boolean regMatchIgCase(String a,String b){
    return a.regionMatches(true,2,b,2,3);
  }
  public static void Sort(){
    for(int i=0;i<data.length;i++){
      for(int j=i+1;j<data.length;j++)
    {
        if(data[i].compareTo(data[j])< 0){
          String temp = data[i];
          data[i] = data[j];
          data[j] = temp;
        }
      }
    }
  }
  public static String repl(String word){
    word = word.replace("the","thaa");
    return word;
  }
}
