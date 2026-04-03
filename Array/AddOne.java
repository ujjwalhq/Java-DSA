// Problem: Add one to a number represented as an array of digits

import java.util.*;

public class AddOne {

    // 🔹 Approach 1: In-place modification (Optimized)
    // ------------------------------------------------
    // Traverse from last index
    // If digit != 9 → add 1 and stop
    // If digit == 9 → make it 0 and carry forward
    // If all digits are 9 → insert 1 at beginning
    // Time Complexity: O(n)
    // Space Complexity: O(1) ✅

    static void addOneInPlace(ArrayList<Integer> arr) {
        int j = arr.size() - 1;

        while (j >= 0) {
            if (arr.get(j) != 9) {
                arr.set(j, arr.get(j) + 1);
                return; // stop once done (you can use break inside of return if you write in main method)
            } 
            else if (j == 0 && arr.get(j) == 9) {
                arr.set(j, 0);
                arr.add(0, 1); // add carry at front
                return;
            } 
            else {
                arr.set(j, 0);
                j--;
            }
        }
    }

    // 🔹 Approach 2: Using new ArrayList (Clean & Readable)
    // ----------------------------------------------------
    // Traverse from last with carry = 1
    // Store result in new list
    // Reverse at end
    // Time Complexity: O(n)
    // Space Complexity: O(n) ❌

    static ArrayList<Integer> addOneNewList(ArrayList<Integer> arr) {
        int n = arr.size();
        int carry = 1;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            int sum = arr.get(i) + carry;

            if (sum <= 9) {
                ans.add(sum);
                carry = 0;
            } else {
                ans.add(0);
                carry = 1;
            }
        }

        if (carry == 1) {
            ans.add(1);
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9); arr.add(9); arr.add(9); arr.add(9);

        System.out.println("Original: " + arr);

        // 🔸 Using Approach 1 (In-place)
        addOneInPlace(arr);
        System.out.println("After In-place: " + arr);

        // 🔸 Using Approach 2 (New List)
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(9); arr2.add(9); arr2.add(9); arr2.add(9);

        ArrayList<Integer> result = addOneNewList(arr2);
        System.out.println("After New List: " + result);
    }
}