class NegativeElements{
  public static void main(String[] args){ 
    int[] arr={2,4,-3,2,-1,7,-3,8,-1,3};

    for(int i=0;i<arr.length;i++){
      if (arr[i]<0) {
        System.out.print(arr[i]+" ");
      }
    }
  }

}