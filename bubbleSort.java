 import java.util.*;
public class bubbleSort {
    public static void getBubbleSort(int nums[],int size){
           int temp;
        for(int turn = 0; turn<size-1; turn++){
            int swap = 0;// for best case to make T/C O(n);
             for(int j = 0; j<size-1-turn; j++){
                 //swapping of larger element to the next element
                 if(nums[j]>nums[j+1]){
                    temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    swap++;
                 }
             }
            if(swap == 0){
                System.out.println("The given array is alredy sorted.");
                 return;
             }
             else{
                System.out.println("Total no. of swapping in "+turn + "th turn = "+ swap);
             }
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
  getBubbleSort(nums, size);
  for(int i = 0; i<size; i++){
    System.out.print(nums[i] + " ");
  }
  }
}
