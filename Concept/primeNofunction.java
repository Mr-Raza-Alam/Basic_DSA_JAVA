package Concept;
import java.util.*;
public class primeNofunction {
    public static boolean isPrime(int n){
        // cormer cases i.e 2 is a prime no. 
        if(n == 2){
            return true;
        } 
     for(int i = 2; i<n; i++){
        if( n % i ==0){
            return false;
        }
     }
     return true;
    }
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the number = ");
    int p = sc.nextInt();
    if(isPrime(p) == true){
  System.out.println(isPrime(p) + ":-The given number "+ p +" is a prime number");
    }
  else{
  System.out.println(isPrime(p) +":-The given number "+ p +" is a non-prime number");
  }
  System.out.print("Enter the range b/w 2 to....upto you = ");
    int q = sc.nextInt();
     rangePrime(q); 
}
public static void rangePrime(int t){
 System.out.println("Total no. of prime no.s b.w 2 " + t + "is given below");
  for(int i = 2; i<=t; i++){
     if(isPrime(i) == true){
        System.out.print(i + " ");
     }
 }
   System.out.println();
}

}
