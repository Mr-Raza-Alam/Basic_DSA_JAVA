package Practice_Session.Recurrsion;

import java.util.Scanner;

// Task is to count no. of zeros present in the given number by user
public class CountZeros {
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        System.out.println("Total no. of zeros present in the number "+n+" = "+countZeros(n,0));
  }
    
static int countZeros(int num,int count){
    if(num == 0) return count;
    
   else if(num%10 == 0) count++;
    return countZeros(num/10, count);
}
}


