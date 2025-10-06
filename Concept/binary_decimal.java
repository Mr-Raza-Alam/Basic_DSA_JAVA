package Concept;
import java.util.*;
public class binary_decimal {
    public static  int power(int p){
        if(p == 0){
           return 1;
        }
     else{
         int t = 1;
         for(int i = 1; i<=p; i++){
                t *=2;
         }
         return t;
     }
 }
  public static int binDecimal(int binum){
    int sum = 0;
    for(int pow = 0; binum>0; pow++){ 
          sum += power(pow)*(binum%10);
          binum /=10;
    }
    return sum;
  } 
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the binary number :- ");
     int n = sc.nextInt();
     System.out.println("The decimal number = " + binDecimal(n));
     System.out.print("Enter the decimal number :- ");
     int dec = sc.nextInt();
     System.out.println("The binary digits = " + deciBinary(dec));
   }
   public static  int power_2(int p){
    if(p == 0){
       return 1;
    }
 else{
     int s = 1;
     for(int i = 1; i<=p; i++){
            s *=10;
     }
     return s;
    }
 }
   public static int deciBinary(int t){
        int finalNum = 0 ;
        for(int i = 0; t>0;i++){
            finalNum += (t%2)*(power_2(i));
            t /=2;
        }
        return finalNum;
   }

}
