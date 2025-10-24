package Practice_Session.Recurrsion;

import java.util.Arrays;
import java.util.Scanner;


// Inverted Right angle triangle  and BubbleSort is also based on its structure
public class Pattern {    
   public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter no. of lines : ");
    // int n = sc.nextInt();
    // System.out.println("The pattern of "+n+" lines is given below\n");
    // printPattern(n);
    int[] nums = {5,6,3,4,2,15,7,1};
    bubbleSort(nums, nums.length-1, 0);
    System.out.println("\nAfter sorting nums : "+Arrays.toString(nums));
   }    

   static void printPattern(int n){
     // base case
     if(n==0) return ;
     // kaam
     for(int i = 1; i<=n; i++) System.out.print("# ");
     System.out.println();
       printPattern(n-1);
   }

static void bubbleSort(int[]arr ,int r,int c){
   if(r <0) return;

   else if(c<r){
       if(arr[c]>arr[c+1]){ // this violation condition to be not ascending order
            int tmp = arr[c];
            arr[c] = arr[c+1];
            arr[c+1] = tmp;
       }
       bubbleSort(arr, r, c+1);
   }else bubbleSort(arr, r-1, 0);
}
}
