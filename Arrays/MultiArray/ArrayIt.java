public class ArrayIt{
  public static void main(String arg[]){
    int arr[][]=new int[5][];
    for (int i = 0; i < 5; i++) 
      arr[i]=new int[i+1];
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        arr[i][j]=i+j+1;
      }
    } 
    //iteration of the multidimentional array starts here
    for (int i []: arr) {
      for (int j: i) {
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}
