package Concept;
import java.util.*;
public class stockProfit {
  public static int getStockProfitAmont(int stockPrice[]){
          int buyPrice = Integer.MAX_VALUE;
          int maxProfit = 0;
          for(int i = 0; i<stockPrice.length; i++){//O(n)
            int sellPrice = stockPrice[i];
             if(buyPrice<sellPrice){
              int profit = sellPrice - buyPrice;//Today's profit
              maxProfit = Math.max(maxProfit,profit);
             }else{
               buyPrice = stockPrice[i];
             }
          }
          return maxProfit;
  }
 public static void main(String args[]){
   int stockPrice[] = {7,6,4,3,1};
   int ans = getStockProfitAmont(stockPrice);
   if(ans == 0){
     System.out.println("NO profit");
   }
   else{
    System.out.println("The max profit = "+ans);
   }
     
  }
}
