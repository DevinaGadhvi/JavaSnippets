
/* Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true*/

class Java_Arr123 {
    public static void main(String[] args) {
        int[] nums={1, 1, 2, 1, 2, 3};
        boolean returnedValue=array123(nums);
        System.out.println(returnedValue);
    }
    
    public static boolean array123(int[] nums) {
  boolean returnFlag=false;
  
  for(int i=0;i<nums.length-2;i++){
     if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3){
       returnFlag=true;
       break;
     }
  }
  return returnFlag;
}

}
