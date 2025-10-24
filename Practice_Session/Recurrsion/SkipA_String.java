package Practice_Session.Recurrsion;

import java.util.Scanner;
 // skip a string from the given string 
public class SkipA_String {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string : ");
    String str = sc.next();
    System.out.print("Enter a string to skip : ");
    String skipStr = sc.next();  
    System.out.println("After skipping "+skipStr + " from "+str+" string : "+skipString(str, skipStr,new StringBuilder()));
   }

   static String skipString(String st,String sk,StringBuilder sb){
     // base condition 
    if(st.isEmpty()) return sb.toString();
     
     // kaam
     else if(st.startsWith(sk)) return skipString(st.substring(sk.length()), sk, sb);
     else
       return skipString(st.substring(1), sk, sb.append(st.charAt(0)));  
    }
}
