import java.util.*;
public class maxSumsubArr {
    public static void getSubArray(int Arr[],int size){
        int tSubArr = 0;
        int max = Integer.MIN_VALUE; 
        for(int i =0; i<size; i++){
            int start = i; 
         for(int j = i+1; j<size; j++){
              int end = j,sum = 0;
            System.out.print("[");
           for(int k = start; k<=end; k++){
            System.out.print(Arr[k]+",");
            sum +=Arr[k];
           }
           tSubArr++;
           if(max<sum){
              max = sum;
           }
           System.out.println("] Sum = " + sum);
         }
         System.out.println();
        }
        System.out.println("Total no. of subarray formed = "+tSubArr);
        System.out.println("The maximum sum = "+max);
    }
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of an array = ");
    int size = sc.nextInt();
   
    int Arr[] = new int[size];
    System.out.println("Enter the data to store in the list ");
    for(int i = 0; i<size; i++){
        int data = sc.nextInt();
        Arr[i] = data;
     }
     getSubArray(Arr, size);
 }
}
