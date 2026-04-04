// Problem: Merge two sorted arrays

public class MergeSortedArrays {
  public static void main(String[] args) {

    int[] arr = {1,3,5,7,9};
    int[] arr2 = {2,4,6,8,10};

    int size = arr.length + arr2.length;
    int[] newarr = new int[size];

    int i = 0, j = 0, k = 0;

    //Compare both arrays
    while (i < arr.length && j < arr2.length) {
      if (arr[i] < arr2[j]) {
        newarr[k++] = arr[i++];
      } else {
        newarr[k++] = arr2[j++];
      }

      // newarr[k++] = (arr[i] < arr2[j]) ? arr[i++] : arr2[j++];   //if you use ternary operator not need to write above code
    }

    //Copy remaining elements
    while (i < arr.length) {
      newarr[k++] = arr[i++];
    }

    while (j < arr2.length) {
      newarr[k++] = arr2[j++];
    }

    // Print merged array
    for (int num : newarr) {
      System.out.print(num + " ");
    }
  }
}