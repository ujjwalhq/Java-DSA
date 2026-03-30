// Problem: Basic Two Sum

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {4, 3, 1, 3, 1, 3};
        int target = 2;

        boolean found = false; 

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }

        // If no pair found
        if (!found) {
            System.out.println("No pair found with given target.");
        }
    }
}