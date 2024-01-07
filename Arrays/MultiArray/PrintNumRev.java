public class PrintNumRev {
  public static void main(String[] args) {
    int arr[][]=new int[5][];
    for (int i = 0; i<5 ; i++) {
     arr[i]=new int[5-i]; 
    }
    for (int i = 0; i < 5; i++) {
     for (int j= 0; j<5-i;j++) {
     arr[i][j] = i+j+1;
     } 
    }
    for (int i[]: arr) {
     for (int j : i) {
      System.out.print(j+" ");
     } 
      System.out.println();
    }
  }
}
