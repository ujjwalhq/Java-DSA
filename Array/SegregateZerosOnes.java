// Problem: Segregate 0s and 1s in the array
public class SegregateZerosOnes {

  static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

  public static void main(String[] args) {
    int[] arr = { 0, 1, 1, 0, 0, 0, 1, 1, 0 };
    int left = 0;
    int right = arr.length - 1;

    Print(arr);
    
    while (left < right) {
      if (arr[left] == 0) {
        left++;
      } 
      else if (arr[right] == 1) {
        right--;
      } 
      else {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        left++;
        right--;
      }
    }

    Print(arr);
  }
}
