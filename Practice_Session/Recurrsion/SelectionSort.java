package Practice_Session.Recurrsion;

import java.util.Arrays;

public class SelectionSort {

    static int findMaxIdx(int[]arr,int checkPoint){
    int currMaxIdx = -1,maxEle = Integer.MIN_VALUE; // - infinity

    for(int i = 0; i+checkPoint<arr.length; i++){
        if(maxEle<arr[i]){
            maxEle = arr[i];
            currMaxIdx = i;
        }
    }

    int actualIdx = arr.length-1-checkPoint;
    return arr[currMaxIdx] != arr[actualIdx]?currMaxIdx:-1;
   }

    public static void main(String[] args) {
            int[] nums = {5,12,3,2,4,15,6};
        System.out.println("Before sorting nums : "+Arrays.toString(nums));
        selectionSort(nums,0);
        System.out.println("\nAfter sorting nums : "+Arrays.toString(nums));    
    }

    static void selectionSort(int[] arr,int c){
        // base condition
        if(c == arr.length) return;
        // main work -- kaam
        
        int currIdx = findMaxIdx(arr, c),actualIdx = arr.length -1-c;
        
        if( currIdx !=-1){ // swapp(arr[currIdx],arr[actualIdx])
             int tmp = arr[currIdx];
             arr[currIdx] = arr[actualIdx];
             arr[actualIdx] = tmp;
        }

        selectionSort(arr,c+1);
    }



}
