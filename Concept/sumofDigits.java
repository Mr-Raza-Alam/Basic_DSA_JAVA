package Concept;
import java.util.*;
public class sumofDigits {
    public static void  main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number = ");
      int n = sc.nextInt();
      System.out.println("\nThe sum of digits of "+ n + " = "+ sumDigit(n));
    }
 public static int sumDigit(int y){
      int sum = 0;
      while(y>0){
        System.out.print((y%10)+" ");
        sum += y%10;
        y /=10;
      }
      return sum;
 }
}
