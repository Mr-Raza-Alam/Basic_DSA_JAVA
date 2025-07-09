import java.util.*;
public class KadanesAlgorithm {
    public static void getKadanesSum(int arr[], int size){
       int maxSum = Integer.MIN_VALUE;
      int currSum = 0;
      for(int i =0; i<size; i++){
        currSum +=arr[i];
          if(currSum<0){
              currSum = 0;
          }
          else{
            if(currSum>maxSum){
                maxSum = currSum;
            }
          }
      }
      System.out.println("The max sum of sub-Array = "+maxSum);
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
   getKadanesSum(Arr, size);
    
 }
}
