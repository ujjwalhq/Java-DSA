public class SumOfArray {
  public static void main(String[] args){
    int[] arr={2,3,4,5,6,7,8,9,0,10};
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("Sum of Array Elements:"+sum);
  }
}
