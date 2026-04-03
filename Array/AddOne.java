// Problem: Add one to a number represented as an array of digits

import java.util.ArrayList;

public class AddOne {
  public static void main(String[] args) {
    ArrayList<Integer> arr= new ArrayList<>();

    arr.add(9);arr.add(9);arr.add(9);arr.add(9);

    System.out.println(arr);

    int j=arr.size()-1;
    while (j>=0) {
      if (arr.get(j)!=9) {
        arr.set(j,arr.get(j)+1);
        break;
      }
      else if(j==0 && arr.get(j)==9){
        arr.set(j,0);
        arr.add(0,1);
  
      }
      else{
        arr.set(j,0);
        j--;
      }
    }

    System.out.println(arr);
  }
}
