// Problem: Multiply odd indexed elements by 2 and add 10 to even indexed elements

public class ModifyArrayElements {

    // Method to print array elements
    static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Original array
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Before:");
        Print(arr);

        // Modify array based on index
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                // Even index → add 10
                arr[i] = arr[i] + 10;
            } else {
                // Odd index → multiply by 2
                arr[i] = arr[i] * 2;
            }
        }

        System.out.println("After:");
        Print(arr);
    }
}