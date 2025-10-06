package Concept;
import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {
    public static void main(String args[]){
      Integer nums[] ={3,2,1,5,7,8,4};
       // Arrays.sort(does not require Object variable)
      //Arrays.sort(nums);// T/C = O(n logn);// it will sort the array's elements in Ascending Order

       // But Arrays.sort(Collections.reverseOrder()),must require Object variable)()
       // reverseOrder() return b-a ,compared value
      Arrays.sort(nums,Collections.reverseOrder());   // T/C = O(n logn);// it will sort the array's elements in Descending Order

       System.out.println("The sorted array in Decreasing Order is given below:-");
     for(int i = 0; i<nums.length; i++){
       System.out.print(nums[i] + " ");
     }

    }
}
