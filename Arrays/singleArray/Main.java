class Main{
  public static void main(String arg[]){
    int arr[]= new int[10];
    for (int i = 0; i < 10; i++) 
    arr[i]= i+1;
    for (int i:arr)
    System.out.println("Elements: "+i); 
  }
}
