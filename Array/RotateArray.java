public class RotateArray {

    static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {8,9,10,1,2,3,4,5,6,7};
        int d = 3;
        int n = arr.length;

        int k = 0;

        // repeat rotation d times
        while (k < d) {

            int first = arr[0];
            int i = 0;

            // shift elements left
            while (i < n - 1) {
                arr[i] = arr[i + 1];
                i++;
            }

            arr[n - 1] = first; // put first at end
            k++;
        }

        print(arr);
    }
}