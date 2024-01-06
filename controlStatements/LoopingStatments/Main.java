class Main{
  public static void main(String arg[]){
    int i=0;
    //syntex and writing of while loop
    System.out.println("At While loop: ");
    while(i<10){
      System.out.println("Count: "+i);
     i++;
    }
    //syntex and writing of do-while loop
    System.out.println("At do while loop: ");
    do{
      System.out.println("count: "+i);
      i--;
    }while(i>0);
    //syntax and way of writing of For loop with initialization;condition;operation
    System.out.println("At for loop: ");
    for(i=0;i<10;i++)
    System.out.println("count: "+i);
    //syntax and way of writing of For loop infinite form
    System.out.println("At infinite for loop: ");
    for(;;){
      System.out.println("count: "+ i);
      i--;
      if (i == 0)
      break;
    }
    //syntax and way of writing of For each loop form
    System.out.println("At for:each loop: ");
    for(String j:arg){
      System.out.println("in argument: "+j);
    }
  }
}
