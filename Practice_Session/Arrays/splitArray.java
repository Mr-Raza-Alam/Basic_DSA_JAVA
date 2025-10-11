package Practice_Session.Arrays;
// Split the given array into k non-empty subarrays and find out the maxSum of subarrays and then minimised it 
public class splitArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,8,10};
        int k = 2;
        System.out.println("Answer : "+getMinimumMaxSum(arr, k));
    }

    static int getMinimumMaxSum(int[] nums,int k){
        int s = 0,e = 0,mid;
        for(int val : nums){ //O(n)
            s = Math.max(s,val); // min.Sum ,if split-value(k) = N(array's size) i.e max. value of the given array i.e lowerbound
            e +=val;  // max.Sum,if split-value(k) = 1 i.e sum of all elements of the given array i.e upperbound
        }
        // here now,we click to apply binary search irrespective of having non-sorted array
       // how to apply??
       while (s<e){ //(n*n)
         mid = s+(e-s)/2; // here mid is average of maxSum

         // now cal. how many pieces we can split array with this maxSum(i.e mid)to find out the potential answer with the help of mid

         int sum = 0,piece = 1; // 1 why b/c atleast 1 subarray will definitely exit i.e array itself 

        for(int val : nums){ //O(n)
            if(sum+val>mid){ // here we can't add val to the exit subArray,so make new subArry i.e sum = num

                piece++;
                sum = val; // start with new subArray

            }else sum+=val; // i.e possible elemnts ,whose sum is <= k(split-value)
        }

        // here now, check no. of pieces(splitted-subArray) 
        if(piece<=k) e = mid; // i.e it is < ,why b/c individual piece will have maximise maxSum  but we need to minimised the maxSum so find in left part of array
        else s = mid+1;// i.e piece>k then  we need to increase the pices size to get potential answer i.e minimised of maxSum of splitted subarray's sum        
       }

    // here now s = e = mid i.e our answer

        return s;
    }
}
