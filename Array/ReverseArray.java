public class ReverseArray {

  static void print(int[] arr){
    for(int num : arr){
      System.out.print(num+" ");
    }
  }
  public static void main(String[] args){
    int[] arr={2,3,4,5,6,7,8,9,10};

    print(arr);

    //Reverse
    int temp;
    int i=0;
    int j=arr.length-1;
    while (i<j) {
      temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      i++;
      j--;
    }
    
    System.out.println();
    print(arr);
  }
}
