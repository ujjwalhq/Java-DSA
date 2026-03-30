// Find the missing number in the array
public class MissingNumber {
  public static void main(String[] args) {

    int[] arr = {1,4,2,5,3,7,9,10,8};

    int n = arr.length + 1;
    int totalSum = n * (n + 1) / 2;
    int arrSum = 0;

    for (int num : arr) {
      arrSum += num;
    }

    System.out.println("The missing number is: " + (totalSum - arrSum));
  }
}