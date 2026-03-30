// Problem: Print the second maximum element in the array

public class SecondMax {
  public static void main(String[] args){
    int[] arr={3,5,2,4,5,7,10,8};
    int max=Integer.MIN_VALUE;
    int smax=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
      if (max<arr[i]) {
        max=arr[i];
      }
    } 
    for(int i=0;i<arr.length;i++){
      if (smax<arr[i] && max!=arr[i]) {
        smax=arr[i];
      }
    } 
    

    System.out.println("Maximum Value"+max);
    System.out.println(smax);
  }
}
