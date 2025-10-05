// import java.util.Scanner;

public class SampleTest_2 {
    public void userNames(String ... n){// here ... n is variable arguments, to access its values ,use forEach Loop
        //Access all userName
        int count = 0;
        System.out.println("The following are the client of AcadeTrack.");         
        for(String name : n){
            System.out.println(name);
            count +=1;
        }
        System.out.println("\nTotal no. of clients = "+count);
    }

 public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder("CodeSpartan");// 16(default) + 11(sb's length) = 27
    // System.out.print("Enter a string : ");    
    // String   s = sc.nextLine();
    System.out.println("The capacity of the string is : "+sb.capacity());
    System.out.println("Lets enjoy string manipulation with the given string i.e \n"+sb);
    System.out.println("Replace Spartan with Spark : "+sb.replace(4, sb.length(), "Spark"));
    System.out.println("The capacity of the string is : "+sb.capacity());

    // System.out.println("Reverse of the given string is : "+sb.reverse());

    // sb.append("OK, I am S_B"); // method-1 .append()
    // System.out.println("After append a string ,original string : "+sb);
    if(sb instanceof StringBuilder){
        System.out.println("Yes "+sb+" is a stringBuilder not a string");
        sb.delete(3,5);
        System.out.println("After deletion the string b/w 3 to 5 : "+sb);
        System.out.println("The capacity of the string is : "+sb.capacity());

    }
    String s = sb.toString(); // now here sb become String class's string i.e imutable
    if(s.compareTo("CodeSpartan")==0)   
       System.out.println(sb+" and CodySpartan are equal");
    else System.out.println(sb+" and CodySpartan are unequal");

 }
    
}
