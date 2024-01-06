import java.util.Scanner;
class Main{
  public static void main(String arg[]){
    int a = 1;
    int b = 2;
    //This program is preview of Control Conditional statement
    //way to write "if" condition and its syntax
    if(a<b){
      System.out.println("A is smaller than B");
    }
    //way to write "if-else" Conditional statement
    if(a>b){
      System.out.println("A is greater than B");
    }
    else{
      System.out.println("B is greater than A");
    }
    //way to write "else if statement"
    if(a>b){
      System.out.println("A is greater than B");
    }
    else if(a<b){
      System.out.println("A is smaller than B");
    }
    else{
      System.out.println("A is equal to B");
    }
    //there is another conditional statement that is switch case
    Scanner sc= new Scanner(System.in);
    //we will talk about the Scanner class later in IO streams for now it is used to take input via console
    int ch;
    //Scanner.nextInt means it will take input in form string and then it will convert he input into integer
    System.out.println("Enter the choice 1 or 2: ");
    ch = sc.nextInt();
    switch(ch){
      case 1:
      System.out.println("This is first case");
      //notice we use break keyword here. The break keyword here is to end the flow fo this conditional statement if we didn't break it 
      //it will check all this cases and will execute every program in this "switch statement"
      //so that why we use break after we end the program
      break;
      case 2:
      System.out.println("This is second case");
      break;
    }
  }
}
