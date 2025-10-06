package Concept;
import java.util.*;
public class loop{
   public static void main(String[] args){
   //prime
   // boolean  isPrime = true;
   // Scanner sc = new Scanner(System.in);
   //     System.out.print("Enter a number = ") ;
   //      int n = sc.nextInt();    
   //  for(int i = 2; i*i<=n; i++){
   //         if(n % i ==0){
   //          System.out.println(n + " is a non-prime number");
   //           isPrime = false;
   //          break;
   //         }
   //    }
   //    if(isPrime == true)System.out.println(n + " is a prime number");


  // break statement;
      
       Scanner sc = new Scanner(System.in);
     
       do{
        System.out.print("Enter a number = ") ;
        int n = sc.nextInt();
        if(n%10 == 0){
            //break;// that means it will be come out as  the number is multiple of 10
            continue;// that means it will skip whole remain programme  as  the number is multiple of 10
        }
        System.out.println(n);
       } while(true);

     //  System.out.println("\nI am out of the loop ");

  // Reverse of number
    //  System.out.print("Enter a number = ") ;
    //    Scanner sc = new Scanner(System.in);
    //    int n = sc.nextInt();
       //System.out.print("The reverse of given number " + n + " = ");
    //    int rev = 0;
    //    while(n>0){
    //     //   int last_digit = n%10;
    //     //   System.out.print(last_digit);
    //     rev = rev * 10  + n%10;
    //       n /=10;
    //    }
    //    System.out.println("The reverse number = " + rev);
    //   System.out.print("Enter the range number = ") ;
    //   Scanner sc = new Scanner(System.in);
    //    int n = sc.nextInt();
    //    System.out.println("The series b/w 1 to "+ n + " are given below :");
    //    int i = 1,sum = 0;
    //    while(i<=n){
    //     System.out.print(i + " ");
    //     sum +=i;
    //     i++;
    //    }
    //  System.out.println("\nThe sum of first " + n + " natural number = " + sum);

    //print Square pattern
    // System.out.print("Enter the no. of rows = ");
    // Scanner raw = new Scanner(System.in);
    // int m = raw .nextInt();
    // System.out.println("The Square pattern is given below");
    
    // for(int i = 1; i<=m; i++){
    //     for(int j = 1; j<=m; j++){
    //         System.out.print(" * ");
    //     }
    //     System.out.println("");
    // }
 }
}
