import java.util.*;
public class numberpattern {
 public static void main(String[] args){
    Scanner row = new Scanner(System.in);
    System.out.print("Enter the no. of lines required =  ");
    int line = row.nextInt();
       char ch = 'A';
       //character pattern
        for(int i = 1; i<=line; i++){//how many times no. of outer-loop will run
          for(int j = 1; j<=i; j++){//how many times no. of inner-loop will run
           System.out.print(ch);// what to print? print one j's value at a time
                 ch++;
          }
        System.out.println();
      }
     //half-pyramid
    // for(int i = 1; i<=line; i++){//how many times no. of outer-loop will run
    //     for(int j = 1; j<=i; j++){//how many times no. of inner-loop will run
    //      System.out.print(j);// what to print? print one j's value at a time
    //     }
    //   System.out.println();
    // }

    //
    // for(int i = 1; i<=r; i++){//how many times no. of outer-loop will run
    //     for(int j = i; j<=r; j++){//how many times no. of inner-loop will run
    //         System.out.print("* ");// what to print? print only  one *(star)
    //     }
    //   System.out.println();
    // }
 }    
}