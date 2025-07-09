import java.util.Scanner;

public class CountingSort {
    public static void getCountingSort(int nums[],int size){
              int largest = Integer.MIN_VALUE;
             for(int i = 0; i<size; i++){// here we find the largest value among the array
                largest = Math.max(largest,nums[i]);
             }
             //create a count array of size = largest/max.element +1
             int count[] = new int[largest+1];
             for(int i = 0; i<size; i++){//here we find the freq.of each element
                count[nums[i]]++;
                System.out.println("count[" + nums[i]+"] = " + count[nums[i]]);
             }
             // sorting
             int j = 0; 
             for(int i =0; i<count.length; i++){
                while(count[i]>0){
                    nums[j] = i;
                    j++;
                    count[i]--;
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
          getCountingSort(nums, size);
        System.out.println("The sorted array in Increasing Order is given below:-");
        for(int i = 0; i<size; i++){
          System.out.print(nums[i] + " ");
        }
   
       }
}
