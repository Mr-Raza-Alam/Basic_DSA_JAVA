package Concept;
import java.util.*;
public class BitwiseOperator {
  public static int getExponentialVal(int a,int b){
    int ans = 1;
    while(b>0) {
      if((b&1)>0){
         ans *=a;
      }
      a = a*a;
      b = b>>1;
    }
    return ans;
  }
  public static int countSetBits(int n){//ask in Google and Amazon
    int count = 0;
    while(n>0){
      if((n & 1) !=0){
         count++;
      }
      n = n>>1;
    }
    return count; 
  }
  public static int getIthbit(int a,int idx){
    int bitMask = 1<<idx;
    if((a & bitMask) == 0){
         return 0;
    }
    else{
      return 1;
    }
  }
  public static int clearlastIthBit(int a,int i){
    int bitmask = (~0)<<i;    
    return (a & bitmask);
  }
  public static int clearBitinRange(int a,int i,int j){
    int x = -1 << (j +1);
    int y = (1<<i) - 1;
    int bitmask = x|y;
    return a & bitmask; 
  }
  public static boolean isPowerof2(int x){
    return (x & (x-1)) == 0;
  }
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number = ");
     int a = sc.nextInt();
     System.out.print("Enter the power on given number = ");
     int p = sc.nextInt();
     System.out.println(a + "^"+p+" = "+getExponentialVal(a, p));
     System.out.println("The total no. of set bits in "+a+" = " + countSetBits(a));
     System.out.println(isPowerof2(a) + " ,"+a+" is a number having Power of 2" );
     if ((a & 1) == 0) {
       System.out.println(a + " is an Even number");
     }  
     else if((a & 1) == 1){
      System.out.println(a + " is an Odd number");
     }
  else{
    System.out.println("Invalid Number");
  }      
   System.out.print("Enter the ith position   = ");
     int idx = sc.nextInt();
    System.out.println(1 + "<<" + idx + " = " + (1<<idx));
    System.out.println("The bit value of "+ a +" at index " + idx + " = "+ getIthbit(a,idx));
   System.out.println("After set bit 1 at index "+idx+" of number "+ a +" = "+getSetbit(a,idx)); 
   System.out.print("Enter the ith position to clear the bit 1  = ");
   int cIdx = sc.nextInt();
  System.out.println("After clear a bit 1 from index "+idx +" of number "+a +" = "+getClearbit(a,cIdx));
  System.out.print("Enter the bit to update in the given number "+a+" = ");
  int var = sc.nextInt();
  System.out.print("Enter the ith position to update the given bit (o or 1) = ");
  int upIdx = sc.nextInt();
  System.out.println("After update the bit "+ var +" from index "+idx +" of number "+a +" = "+getUpdateBit(a,upIdx,var));
  System.out.println(clearlastIthBit(a,3));
   System.out.println(clearBitinRange(25, 0, 3));
}
 public static int getSetbit(int a,int idx){
  int bitmask = 1<<idx;
  return (a | bitmask);
 }
 public static int getClearbit(int a,int cIdx){
  // 1st method then return a^bitmask;
   int bitMask = 1<<cIdx; 
     //or 2nd method then return a & bitmask
     // int bitMask = ~(1<<idx);
     return (a^bitMask);
 }
 public static int getUpdateBit(int a, int upIdx,int var){
  int bitMask = 1<<upIdx ;   
  if(var == 0){
       return (a ^ bitMask);
      }
   else if(var == 1){
    return (a ^ bitMask);
   }
  return 0;
 }
}
