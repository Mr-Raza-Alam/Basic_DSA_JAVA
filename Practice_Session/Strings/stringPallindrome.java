// Ques.1)
package Practice_Session.Strings;

import java.util.Scanner;

public class stringPallindrome {
    public static void isPallindrome1(String s){//O(n)-->Brute-force approach        
        // now converts string s into stringbuilder
        StringBuilder sb = new StringBuilder(s); // this is required for comparasion after reverse sb
        sb.reverse();
        if(s.equals(sb.toString())) System.out.println("Yes,Pallindrome");
        else System.out.println("No,Pallindrome");
    }

    public static boolean isPallindrome(String st){// O(n) --> simple for loop or 2-pointers approach
        
        int n = st.length();
         for(int i = 0; i<n; i++){
            if(st.charAt(i) != st.charAt(n-1-i)) return false;
         }
         /*
        // first cal. mid-point of the string 
        // if string's length is even,mid = length/2-1 else ,mid = length/2;
        int n = st.length(),mid;
        mid = (n & 1) == 1?n/2:n/2 -1;
        int s = 0,e = n-1;
        while(s<=mid){
            if(st.charAt(s) != st.charAt(e)) return false;
            s++;
            e--;
        }*/
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your favourite string : ");
        String s = sc.nextLine();
        System.out.println(isPallindrome(s)?"Yes,Pallindrome":"No,Pallindrome");
        isPallindrome(s);
    }
}
