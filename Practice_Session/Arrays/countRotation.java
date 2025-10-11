package Practice_Session.Arrays;

public class countRotation{
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,8,0,1,2};
         System.out.println("Total no. of rotation : "+countNoOfRotation(nums));
    }

    public static int countNoOfRotation(int[]arr){      
        return getPivot(arr)+1;
    }
    
    public static int getPivot(int[]arr){
        int s = 0,e = arr.length-1,mid;

        while(s<=e){
           mid = s+(e-s)/2;
           if(mid<e && arr[mid]>arr[mid+1]) return mid;
           else if(mid>s && arr[mid-1]>arr[mid]) return mid-1;
           else{
            if(arr[s]>arr[mid]) e = mid-1;
            else s = mid+1;
           }
        }
        return -1;
    }
    
}
