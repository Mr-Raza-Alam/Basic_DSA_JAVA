 import java.util.*;
public class insertionSort {
    public static void getInsertionSort(int nums[],int size){
        for(int i = 1; i<size;i++){
            int  currVal = nums[i],prev = i-1;
            // finding the correct postion to insert
          while(prev>=0 && (nums[prev]>currVal)){// if prevValue > currValue then shifth to last
               nums[prev + 1] = nums[prev];// shift to last 
               prev--;
          }
          // insertion
          nums[prev + 1] = currVal;
        }
    }
       public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter the array's size = ");
           int size = sc.nextInt();
          int nums[] = new int[size];
          System.out.println("Enter the data to store in the given array");
          for(int idx = 0; idx<size; idx++){
              int data = sc.nextInt();
               nums[idx] = data;
          }
        getInsertionSort(nums, size);
        System.out.println("The sorted array in Increasing Order is given below:-");
        for(int i = 0; i<size; i++){
          System.out.print(nums[i] + " ");
        }
   
       }
}
