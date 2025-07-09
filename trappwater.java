import java.util.*;
public class trappwater {
    public static int getAmountofTranpwtaet(int height[]){//O(n);
          int n = height.length;
        //Cal. max left boundry --->helper's Array
          int leftMax[] = new int[n];
          leftMax[0] = height[0];
          for(int i = 1; i<n; i++){
                leftMax[i] = Math.max(height[i],leftMax[i-1]);
          }
         //Cal. max righy boundry ----->helper's Array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
      }
        // loop
         //waterlevel = min(left max bound,right max bound)
        int getAmount = 0;
         for(int i =0; i<n; i++){
      int waterlevel = Math.min(leftMax[i],rightMax[i]);
      getAmount +=(waterlevel - height[i]);
     }
         // getTrapp_water = waterlevel - height[i];
             return getAmount;
    }
    public static void main(String args[]){
      int height[] = {4,2,0,3,2,5};
      int ans = getAmountofTranpwtaet(height);
      System.out.println("The amount of trapped-water = " + ans);
    }
}
