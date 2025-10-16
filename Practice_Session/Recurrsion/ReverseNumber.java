package Practice_Session.Recurrsion;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        System.out.println("The reverse of number "+n+" = "+reverseNum(n,0));
    }

    static int reverseNum(int num,int rev){
        if(num == 0) return rev;
        rev = rev*10 + num%10;
        return reverseNum(num/10, rev);
    }
    
}
