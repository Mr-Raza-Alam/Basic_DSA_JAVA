package Practice_Session.Strings;

import java.util.Scanner;

// Convert first letter of each word in a sentence to uppcase 
public class stringUppercase {
   public static void letterUpperCase(String s){
    int n = s.length();
    StringBuilder sb = new StringBuilder("");
    sb.append(Character.toUpperCase(s.charAt(0)));
    for(int i = 1; i<n; i++){
        if(i<n && s.charAt(i) == ' '){
            sb.append(" ");
           sb.append(Character.toUpperCase(s.charAt(++i)));
        }else sb.append(s.charAt(i));
        
    }
     System.out.println("After capitalization : "+sb);
   }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    System.out.print("Enter a string : ");
    String s = sc.nextLine();
    letterUpperCase(s);
    }
    
}
