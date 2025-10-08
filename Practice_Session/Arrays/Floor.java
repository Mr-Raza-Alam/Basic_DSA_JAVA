package Practice_Session.Arrays;
// Problem is based on binary serach concept

import java.util.Scanner;

public class Floor { // Floor of a number
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = {2,3,5,12,15,17,19};
            System.out.print("Enter a target value : ");
            int tar = sc.nextInt();
            System.out.println("The ceiling of number : "+ceilingOfNumber(arr, tar));
        }
    }
   
    public static int ceilingOfNumber(int[] arr,int target){
        int s = 0,e = arr.length-1,mid;   
        while(s<=e){
          mid = s+(e-s)/2;
         if(arr[mid]==target) return arr[mid];
         else if(arr[mid]>target) e = mid-1;     
         else  s = mid+1;         
        }    
    return arr[e]; // if target is no meet ,then this a floor value
   }    
    
}
