// Cyclic sort --> Applicable ,when given set of numbers are in the range [1,N]  without repeatetion
package Practice_Session.Arrays;

import java.util.Arrays;

public class cyclicSort {

    public static void main(String[] args) {
    //   int[] arr = {3,4,2,5,1};
      int[] arr = {4,3,2,7,8,2,3,1};
      System.out.print("Befor sorting , num : ");
      for(int val:arr) System.out.print(val+" ");
      sort(arr);
        
    }
    static void sort(int[] num){
        int i = 0;
        while(i<num.length){
            int corIdx = num[i]-1; // corIdx means correctIndex and  nums[i] is for range [0,N] or [0,N-1]
            if(num[i] != num[corIdx]) swap(num,i,corIdx);
            else i++;
        }        
        System.out.println("\nAfter sorting , num : "+Arrays.toString(num));
    }

    static void swap(int[] num,int i,int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
