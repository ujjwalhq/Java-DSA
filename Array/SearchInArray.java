// Problem: Search in Array
import java.util.Scanner;

public class SearchInArray {

    public static void main(String[] args) {

        // Given array
        int[] arr = {2,3,7,2,8,3,9,4,2,16,20,13,14,17};

        int num;
        boolean isPresent = false;   

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number which you want to search: ");
        num = sc.nextInt();

        // Loop to search element
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                isPresent = true;   // element found
                break;              // stop loop 
            }
        }

        // Output result
        if (isPresent) {
            System.out.println("Yes, number is present.");
        } else {
            System.out.println("Number is not present.");
        }

        sc.close(); 
    }
}