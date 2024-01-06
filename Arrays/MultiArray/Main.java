public class Main{
  public static void main(String arg[]){
  int marr[][]=new int[5][5];
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
       marr[i][j]=i+j+1; 
      }
    }
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(" "+marr[i][j]);
      }
      System.out.println();
    }
  }
}
