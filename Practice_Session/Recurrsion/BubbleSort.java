package Practice_Session.Recurrsion;

import java.util.Arrays;

// Bubble Sort Algorithm
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5,12,3,2,4,15,6};
        System.out.println("Before sorting nums : "+Arrays.toString(nums));
        bubbleSort(nums, nums.length -1);
        System.out.println("\nAfter sorting nums : "+Arrays.toString(nums));
    }

    static void bubbleSort(int[] arr,int n){
       if(n<0) return;

       for(int i = 0; i<n; i++){
        if(arr[i]>arr[i+1]){ // violet ascending order's rule

            // swapp(arr[i],arr[i+1]);
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
       }
       bubbleSort(arr, n-1);
    }

}
