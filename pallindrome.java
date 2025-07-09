import java.util.*;
public class pallindrome {
    public static boolean pallinum(int x){
        int r = 0,N = x;
        while(x > 0)    {
            r *=10;
            r = r + x%10;
           x /=10; 
        }
     if(N == r){
        return true;
     }
     else {
        return false;
     }
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number = ");
       int a = sc.nextInt();
       if(pallinum(a) == true){
         System.out.println(a +" is a pallindrome number");
       }
       else{
        System.out.println(a +" is not a pallindrome number");
       }
       System.out.print("Enter the range = ");
       int n = sc.nextInt();
       System.out.println("Total no. of pallindrome number are:-");
       rangePallinum(n);
    }
    public static void rangePallinum(int m){
        for(int i = 101; i<=m; i+=5){
            int  rem = 0, M= i;
            while(i > 0){
                rem *=10;
                rem = rem + i%10;
               i /=10; 
            }
         if(M == rem){
          System.out.print(i + " ");
          }
        }
    }
    
}
