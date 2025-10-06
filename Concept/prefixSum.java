package Concept;
import java.util.*;
public class prefixSum {
    public static void getPrefixSum(int Arr[],int size){
           int prefixSum[] = new int[size];
           prefixSum[0] = Arr[0];
        for(int i =1; i<size; i++){
            prefixSum[i] = prefixSum[i-1]+Arr[i];
        }
        //insertion sort for max sum of subarray;
        int temp;
      for(int i = 1; i<size; i++){
          int j = i; 
          while(j>0 && (prefixSum[j-1]>prefixSum[j])){
                   temp = prefixSum[j-1];
                   prefixSum[i-1] = prefixSum[i];
                   prefixSum[i] = temp;
                   j--;
          }
      }
      System.out.println("The max sum of subarray = "+prefixSum[size-1]);
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
     getPrefixSum(Arr, size);
 }
 }

