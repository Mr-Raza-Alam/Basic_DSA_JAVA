import java.util.Scanner;
public class swapbit {
 public static void main(String ara[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the 1st value = ");
    int x = sc.nextInt();
    System.out.print("Enter the 2nd value = ");
    int y = sc.nextInt();
    //question1
    System.out.println("the value of x^x = "+(x^x));
    System.out.println("the value of y^y = "+(y^y));
    //question2
    System.out.println("Before swapping the no.s\n x = "+x +"\ny = "+ y);
    x = x^y;
    y = x^y;
    x = x^y;
    System.out.println("After swapping the no.s\n x = "+x +"\ny = "+ y);
    //question 3
    System.out.println("After add 1 to "+x + "\nThe ans = "+(-(~x)));
    System.out.println("After add 1 to "+y + "\nThe ans = "+(-(~y)));
    //question 4 uppercase to lowercase
    System.out.println("UpperCase to LowerCase");
    for(char ch = 'A'; ch<='F'; ch++ ){
        System.out.print((char)(ch | ' ') + " ");
    }
 }
}
