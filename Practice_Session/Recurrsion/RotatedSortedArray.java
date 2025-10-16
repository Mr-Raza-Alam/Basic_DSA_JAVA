package Practice_Session.Recurrsion;

import java.util.Scanner;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] num = {5,6,7,8,9,1,2,3};
     Scanner sc = new Scanner(System.in) ;
     System.out.print("Enter a target : ");
      int x = sc.nextInt();
      System.out.println(x+" is found at index : "+findTargetIdx(num, x, 0, num.length-1));
    }

    static int findTargetIdx(int[] arr,int key,int s,int e){
        // base condition
        if(s>e) return -1; // target is not found
        // kaam
        int mid = s +(e-s)/2;
        if(arr[mid]== key) return mid;
        // case-1 ,
        else if(arr[s]<=arr[mid]){
            //  if target is lie b/w [start ---- mid)
            if(key>=arr[s] && key <arr[mid]) return findTargetIdx(arr, key, s, mid-1) ;
            else return findTargetIdx(arr, key, mid+1, e);
        } // case-2  if target is lie b/w (mid ---- end],then search in right subArray
        else if(key>arr[mid] && key<=arr[e]) return findTargetIdx(arr, key, mid+1, e);
         return findTargetIdx(arr, key, s, mid-1);       
    }
}
