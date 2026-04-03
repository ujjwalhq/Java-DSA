// Problem: Reverse elements in an ArrayList

import java.util.ArrayList;

public class ReverseArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> arr=new ArrayList<>();

    arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(5);
    
    System.out.println("Array:\n"+arr);

    int i=0;
    int j=arr.size()-1;

    while (i<j) {
      int temp=arr.get(i);
      arr.set(i,arr.get(j));
      arr.set(j,temp);
      i++;
      j--;
    }

    System.out.println("\nAfter Reverse:");
    System.out.println(arr);
  }
}
