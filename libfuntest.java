import java.util.*;
public class libfuntest {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the 1st number = ");
     int a = sc.nextInt();
     System.out.print("Enter the 2nd number = ");
     int b = sc.nextInt();
     System.out.println("The minimum of a & b = "+ Math.min(a,b));
     System.out.println("The maxmimum of a & b = "+ Math.max(a,b));
     System.out.println("The value of a to the power b = "+ Math.pow(a,b));
     System.out.println("The square root of a  = "+ Math.sqrt(a));
     System.out.println("The square root of b = "+ Math.sqrt(b));
     //System.out.println("The average of a & b = "+ Math.abs(a,b));
    }
}
