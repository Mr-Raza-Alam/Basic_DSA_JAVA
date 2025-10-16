package Practice_Session.Recurrsion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,7,8,12,15};
        System.out.println("Target is located at index : "+binSearch(arr, 8, 0, arr.length-1));
    }

    public static int binSearch(int[] arr,int target,int s,int e){
        // base condition
        if(s>e) return -1; // if target is not found
        //main--work
        // cal. mid  
       int mid = s + (e-s)/2;
        // check ,the element at index mid is = to the target?found:element at mid>target?search in left subArray i.e e = mid-1: search in right subArray i.e s = mid+1
        if(arr[mid] == target) return mid;
        else if(arr[mid]>target) // target is found,return its index
        return binSearch(arr, target, s, mid-1); // search in leftt subArray
        else return binSearch(arr, target, mid+1, e); // search in right subArray
    }
    
}
