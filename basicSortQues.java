import java.util.*;
public class basicSortQues {

    public static void getSelectionSort(int nums[],int size){
        for(int turn = 0; turn<size-1; turn++){
            int minPos = turn;
             for(int j = turn+1; j<size; j++){
                 if(nums[minPos]<nums[j]){
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
      // getBubbleSort(nums, size);
      //   getSelectionSort(nums, size);
      //  getInsertionSort(nums, size);
        getCountingSort(nums, size);
     System.out.println("The sorted array in Decreasing Order is given below:-");
     for(int i = 0; i<size; i++){
       System.out.print(nums[i] + " ");
     }
}
    public static void getInsertionSort(int nums[],int size){
        for(int i = 1; i<size;i++){
            int  currVal = nums[i],prev = i-1;
            // finding the correct postion to insert
          while(prev>=0 && (nums[prev]<currVal)){// if prevValue > currValue then shifth to last
               nums[prev + 1] = nums[prev];// shift to last 
               prev--;
          }
          // insertion
          nums[prev + 1] = currVal;
        }
    }
    public static void getBubbleSort(int nums[],int size){
        int temp;
     for(int turn = 0; turn<size-1; turn++){
         int swap = 0;// for best case to make T/C O(n);
          for(int j = 0; j<size-1-turn; j++){
              //swapping of larger element to the next element
              if(nums[j]<nums[j+1]){
                 temp = nums[j+1];
                 nums[j+1] = nums[j];
                 nums[j] = temp;
                 swap++;
              }
          }
         if(swap == 0){
             System.out.println("The given array is alredy sorted.");
             break;
          }
          else{
             System.out.println("Total no. of swapping in "+turn + "th turn = "+ swap);
          }
     }
 }
 public static void getCountingSort(int nums[],int size){
    int largest = Integer.MIN_VALUE;
   for(int i = 0; i<size; i++){// here we find the largest value among the array
      largest = Math.max(largest,nums[i]);
   }
   //create a count array of size = largest/max.element
   int count[] = new int[largest+1];
   for(int i = 0; i<size; i++){//here we find the freq.of each element
      count[nums[i]]++;
      System.out.println("count[" + nums[i]+"] = " + count[nums[i]]);
   }
   // sorting
   int j = size -1; 
   for(int i =0; i<count.length; i++){
      while(count[i]>0){
          nums[j] = i;
          j--;
          count[i]--;
      }
   }
}
}

