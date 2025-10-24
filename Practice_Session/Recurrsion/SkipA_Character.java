package Practice_Session.Recurrsion;

import java.util.Scanner;

// skip a character from the given string
public class SkipA_Character {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string : ");
    String str = sc.next();
    System.out.print("Enter a character to skip : ");
    char ch = sc.next().charAt(0);
    System.out.println("After skipping the character '"+ ch +"' : "+skipCharcter(str, new StringBuilder(), ch,0));
 }
  static String skipCharcter(String s,StringBuilder sb,char c,int i){
      if(i == s.length()) return sb.toString();

      char ch = s.charAt(i);
      if(ch != c) return skipCharcter(s, sb.append(ch),c,i+1);
      return  skipCharcter(s, sb,c,i+1);      
  }
}
