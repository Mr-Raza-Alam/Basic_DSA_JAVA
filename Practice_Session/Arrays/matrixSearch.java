package Practice_Session.Arrays;

import java.util.Scanner;

// This is for searching a target element in the sorted matrix
public class matrixSearch {
   public static void main(String[] args) {
    int[][] arr={{10,20,30,40},{15,24,35,45},{19,28,37,49},{25,33,39,50}};
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a target value : ");
    int target = sc.nextInt();
   System.out.println(isFound(arr, target)?"Found":"Not found");   
   }  

   static boolean isFound(int[][]arr,int target){
      int r = 0,c=arr[0].length-1;

      while (r<arr.length && c>=0){
        if(arr[r][c]==target) return true;
        else if(arr[r][c]>target) c--;
        else r++;
      }

    return false;
   }
}
