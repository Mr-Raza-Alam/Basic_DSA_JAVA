package Concept;
import java.util.Arrays;
public class QuestionARRpart1 {
    public static boolean getDuplicateElement(int nums[]){//boolean
         Arrays.sort(nums);   
         System.out.println("The sorted array's elements are");
        for(int i = 0; i<nums.length; i++){
               System.out.print(nums[i] + " ");
           }
       for(int i = 0; i<nums.length - 1; i++){//O(n)
        if(nums[i] == nums[i+1]){
            return true;
           }
       }
         return false;
    }
 public static void main(String args[]){
    //rotate target = k,k times and the search target's value'index
    int arr[] ={2,4,5,7,8,1,3,0,6};
     int target = 0,res =  getTargetIndex(arr,target);;
    System.out.println("\n"+target+" is avialable at index = "+res);
 }
 public static int getTargetIndex(int arr[], int target){
          for(int i = 0; i<target; i++){// target = k, loop run k times
              getRotateArr(arr);
          }
   // search the target's element After k times rotation of array's elemen in ACW dir.
        for(int i = 0; i<arr.length; i++){//O(n)
             if(arr[i] == target){
                return i;
             }
        }
        return -1;
 }
 public static void getRotateArr(int arr[]){
    // step-1 n = arr[0];
    int n = arr[0];
    // step-2 loop i = 0 to i = arr.length-1;
    for(int i = 0; i<arr.length-1; i++){//O(n)
         arr[i] = arr[i+1];
    }
    // step-3 arr[arr.length - 1] = n;
    arr[arr.length - 1] = n;
 }
}
