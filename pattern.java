import java.util.*;
public class pattern {
 public static void main(String[] args){
    Scanner row = new Scanner(System.in);
    System.out.print("Enter the no. of lines required =  ");
    int r = row.nextInt();
    //inverted-star
    for(int i = 1; i<=r; i++){//how many times no. of outer-loop will run
        for(int j = i; j<=r; j++){//how many times no. of inner-loop will run
            System.out.print("* ");// what to print? print only  one *(star)
        }
      System.out.println();
    }
    //tri-star
    // for(int i = 1; i<=r; i++){//how many times no. of outer-loop will run
    //     for(int j = 1; j<=i; j++){//how many times no. of inner-loop will run
    //         System.out.print("* ");// what to print? print only  one *(star)
    //     }
    //   System.out.println();
    // }
 }    
}
