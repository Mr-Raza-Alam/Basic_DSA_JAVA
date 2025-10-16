package Practice_Session.Recurrsion;

import java.util.Scanner;

// Task : to sum up all digits of a given number by user and then add them consequentlly and return its total sum as output
public class SumOfDigits {
    public static void main(String[] args) {
      Scanner  sc = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int n = sc.nextInt();
    //   System.out.println("The sum of digits of number "+n+" = "+sumOfDigits(n, 0));
      System.out.println("The product of digits of number "+n+" = "+productOfDigits(n, 1));
    }

    static int sumOfDigits(int num,int sum){
        if(num==0) return sum;
        sum +=num%10;
        return sumOfDigits(num/10, sum); // this is a Tail Recursive call
    }

    static int productOfDigits(int num,int pro){
        if(num==0) return pro;
        pro *=(num%10);
        return productOfDigits(num/10, pro); // this is a Tail Recursive call
    }        
    
}

