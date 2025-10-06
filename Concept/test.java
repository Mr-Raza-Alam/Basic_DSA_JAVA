package Concept;
import java.util.Scanner; // this library is imported from JRE 
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a line : ");
        // String line = sc.nextLine();
        System.out.print("Enter an integer input : ");
        int num = sc.nextInt();
        System.out.print("Enter a word : ");
        String word = sc.next();
        sc.nextLine();
        System.out.print("Enter a line : ");
        String line = sc.nextLine();
        sc.close(); // now no further Scanner class's  mether can't be used b/c sc has been release all resource associated with scanner
        num = sc.nextInt();
        System.out.println("Integer value : "+num);
        
        System.out.println("Integer value : "+num);
        System.out.println("A word : "+word);
        System.out.println(line.isEmpty()?"leftover newline":"line : "+line); //.isEmpty()--> check line has "" or not 
        // num = sc.nextInt(); // here  i get an error message i.e IllegalStateExceptin
        // System.out.println("Integer value : "+num);

        // System.out.println(line.equals("")?"leftover newline":"line : "+line);

        // System.out.println("Hello code world");//System.out -->> 
        //  byte b = 4;
        //  char c = 'a';
        //  short s =  512;
        //  int i = 1000;
        //  float f = 3.14f;
        //  double d = 99.9954;
        //  System.out.println((f*b)+(i%c)-(d*s)); //output is minimum value

    }
}
//boilerplate code