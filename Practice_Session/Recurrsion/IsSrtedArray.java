package Practice_Session.Recurrsion;

// check the given number is sorted or not
public class IsSrtedArray {
    public static void main(String[] args) {
        int [] arr = {3,4,5,6,7,8};
        System.out.println(isSorted(arr, 0)?"Yes given array is sorted":"Yes given array is unSorted");
    }
    
    static boolean isSorted(int[]arr,int i){ //O(n),n = size of array
        // base condition
        if(i == arr.length -1) return true; // when i is at last index,it means,array is sorted in ascending order
        // kaam
        else if(arr[i]>arr[i+1]) return false; // if at any point in b/w the elements found ,rule violation of ascending order,then it is unsorted array,so return false
        return isSorted(arr, ++i);
    }
}
