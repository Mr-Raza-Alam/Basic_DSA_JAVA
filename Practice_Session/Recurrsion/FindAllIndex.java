package Practice_Session.Recurrsion;

import java.util.ArrayList;
import java.util.Scanner;

// Challenge : return an ArrayList, situation is created an ArrayList inside the recurrsive function
public class FindAllIndex {
    public static void main(String[] args) {
     int[] num = {2,5,2,1,5,1};
      Scanner sc = new Scanner(System.in) ;
     System.out.print("Enter a target : ");
      int x = sc.nextInt();
    //  System.out.println(x+" is found at indices : "+findAll(num, x, 0, false));
     System.out.println(x+" is found at indices : "+orFindAll(num, x, 0));

    }

    static ArrayList findAll(int[]arr,int target,int idx,boolean isFound){ // O(n)
        ArrayList<Integer> list = new ArrayList<>();
        // base condition
        if(idx >= arr.length) return list;
       // kaam
        else if(arr[idx] == target) isFound = true;
        list = findAll(arr, target, idx+1,false);
        if(isFound) list.add(idx);
        return list;
    }
   // or choice this also
       static ArrayList orFindAll(int[]arr,int target,int idx){
        ArrayList<Integer> list = new ArrayList<>();
        // base condition
        if(idx >= arr.length) return list;
       // kaam
        else if(arr[idx] == target) list.add(idx);
      ArrayList<Integer> answerFrombelow = orFindAll(arr, target, idx+1);
        list.addAll(answerFrombelow);
        return list;
    }
}
