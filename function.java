 import java.util.*;
public class function {
 public static int factorial(int x){
        int p = 1;
          for(int i = x; i>0; i-- ){
             p *=i;
          }
          return p;
 }
    public static int product(int a , int b){
             return (a * b);
    }
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the 1st no. = ");
          int a = sc.nextInt();
          System.out.print("Enter the 2nd no. = ");
          int b = sc.nextInt();
          int c = product(a,b);
          System.out.println("The result = " + c);
          System.out.println("Factorial of " + a 
          +" = " +  factorial(a));
          System.out.println("Binomial coefficent  of " + a 
          +"C"+b+" = " +  binomial(a,b));
    }
 public static int binomial(int y, int z){
          
            return   factorial(y)/(factorial(y-z)*factorial(z)); 
 }
    
}
