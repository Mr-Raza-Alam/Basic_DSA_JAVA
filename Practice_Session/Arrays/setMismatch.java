package Practice_Session.Arrays;

import java.util.Arrays;

// leetcode-645 
public class setMismatch {

public static void main(String[] args) {
    int nums[] = {1,2,2,4};
    findErrorNums(nums);
    
}
  public static void findErrorNums(int[] nums) {
      int[] res = new int[2] ; // one is duplicate and another is missing one
       int i = 0; 
       while(i<nums.length){
        int corrIdx = nums[i]-1;
        if(nums[i]!=nums[corrIdx]) swapp(nums,i,corrIdx);
        else i++;
       }  

       i = 0; 
       while(i<nums.length){
        if(nums[i] != i-1){
            res[0] = nums[i]; // duplicate element
            res[1] = i+1; // here i+1 ,is the missing value
            break;
        }
        i++;
       } 

       System.out.println("Set misMatch : "+Arrays.toString(res));  
     }
    public static void swapp(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
