package Practice_Session.Arrays;

import java.util.Scanner;

// Find the given target array in an infinite Array(i.e array's size is unknown)
public class InfiniteArray {
    public static void main(String[] args) {
     int []nums = {2,3,4,5,11,13,15,16,23,25,33,35};
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a target value : ");
     int x = sc.nextInt();
     int s = 0,e=1; // take a chunk/box of size 2 ,to check the required target value is lie b/w this range otherwise double the size of box and then recheck the requied target lie or not
      
     while(x > nums[e]){
        int newS = e+1;
        e  = e + (e - s + 1)*2; // e + size*2,size = e-s+1;
        s = newS;
       if(e >= nums.length) e = nums.length -1;
     }
     System.out.println("start & end : "+s+" & "+e);
     // now apply binary search to find out the target value within a genuine range.
     System.out.println(binarySearch(nums, x, s, e)!= -1?"Found":"Not Found");

    }
    public static int binarySearch(int[]arr,int target,int s,int e){
        int mid;
        while(s<=e){
            mid = s + (e-s)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] >target) e = mid-1;
            else s = mid+1;
        }
        return -1;
    }
}
