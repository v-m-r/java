class Main{
  public static void main(String arg[]){
    //this program describes how to use looping statements in your program
    //we will be talking about while loop
    //while is infinite loop if there is no condition so we have close it with a condition unless until we have an idea of what we are doing
    int i =0;
    while(i<11){
      System.out.println("count: "+i);
      i++;
      //the keyword break is also a flow control statements which break the flow of program, loop, execution etc.,
    }
    // at this point we will be seeing how do While loop works the do while loop is a loop which executes first and checks condition next it goes like this
    i = 0;
    do{
    System.out.println("count: "+i);
      i++;
    }while(i<10);
    //we have another looping statement called for loop here is how it is written and executed
    System.out.println("Reversed numbers");
    for(i=10;i>0;i++)
    System.out.println("count: "+i);
    //we can also write also have for each loop in java programming language which writteng for(obj o:objArray)
    //we can also use for in an infinite loop without giving any thing in the braces except";;"for(;;){
    //program comes here
    //}
    
  }
}
