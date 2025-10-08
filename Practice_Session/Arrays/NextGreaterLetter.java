package Practice_Session.Arrays;

import java.util.Scanner;

public class NextGreaterLetter {
    public static void main(String[] args) {
     char[]letters = {'c','f','j'};
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a target letter : ");
     char ch = sc.next().charAt(0);
     System.out.println("Next Greatest Letter : "+nextGreatestLetter(letters,ch));
    }

  public static char nextGreatestLetter(char[] letters, char ch) {
        int s = 0,e = letters.length-1,mid;

        while(s<=e){
            mid = s+(e-s)/2;
           if(s<letters.length && letters[mid]>ch) e = mid-1;
            else s = mid+1;
        System.out.println("Mid & Start : "+mid+" & "+s);

        }
        System.out.println("Start : "+s);
        return letters[s%letters.length];
    }    
    
}
