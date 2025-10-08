package Practice_Session.Arrays;

public class EvenNoOfDigit {
    public static void main(String[] args) {
      int[] nums = {12,345,2,6,7893};
      System.out.println("Total no. of Even digits numbers : "+ findNumbers(nums));

    }
    public static int findNumbers(int[] nums) {
        String[]strArr = new String[nums.length];
      // First assign integer value to String's object by converting it to a string object
      for(int i = 0; i<nums.length; i++) strArr[i] = String.valueOf(nums[i]);

        int count = 0;
        for(String val:strArr){
            if((val.length()& 1) ==0) count++;
        }
        return count;
    }    
}
