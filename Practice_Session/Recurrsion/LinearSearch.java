package Practice_Session.Recurrsion;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
      int[] num = {5,8,9,11,8,2,8,1,11,2,5};
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a target : ");
      int x = sc.nextInt();
    //   System.out.println(x+" is found at index : "+ findIdx(num, x, 0));   

      System.out.println(x+ " is present at indices : " + findAllIdx(num, x, 0, new ArrayList<>()));
    }

    static int findIdx(int[] arr,int target,int i){
        // base condition
        if(i== arr.length) return -1; // target is not found
      
        if(arr[i] == target) return i; // target is found ,return this index
        else if(arr[i]<target) ++i;
        else ++i;
        return findIdx(arr, target, ++i);
    }
  
     static ArrayList findAllIdx(int[]arr,int target,int i,ArrayList<Integer>list){
        if(i>=arr.length) return list; 
        
       else if(arr[i] == target) list.add(i); // target is found ,return this index
        return findAllIdx(arr, target, ++i, list);
     }

     
}
