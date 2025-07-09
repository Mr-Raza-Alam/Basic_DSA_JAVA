import java. util.*;
public class NumofLowerVowel {
    public static int getVowelInLowercase(String sent){
           int n = sent.length(),count = 0;
      for(int i = 0; i<n; i++){
         if(sent.charAt(i)=='a'||sent.charAt(i)=='e'||sent.charAt(i)=='i'||sent.charAt(i)=='o'||sent.charAt(i)=='u'){
                  count++;
            }
           }
        
        return count; 
    }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string here:- ");
    String str = sc.nextLine();
    System.out.println("The total no. of lowercase-vowels = "+getVowelInLowercase(str));
  }
}
