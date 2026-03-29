public class MaxElementArray {
  public static void main(String[] args){
    int arr[]={2,4,5,6,7,1,0,3};
    
    // int max=arr[0];
    int max=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
      if (max<arr[i]) {
        max=arr[i];
      }
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("Maximum:"+max);

  }
}
