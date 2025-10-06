package Concept;
import java.util.*;
public class selectionSort {
    public static void getSelectionSort(int nums[],int size){
     for(int turn = 0; turn<size-1; turn++){
         int minPos = turn;
          for(int j = turn+1; j<size; j++){
              if(nums[minPos]>nums[j]){
                      minPos = j;                
              }
          }
          int temp = nums[minPos];
          nums[minPos] = nums[turn];
          nums[turn] = temp;
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
     System.out.println("The sorted array in Increasing Order is given below:-");
     getSelectionSort(nums, size);
     for(int i = 0; i<size; i++){
       System.out.print(nums[i] + " ");
     }

    }
}
