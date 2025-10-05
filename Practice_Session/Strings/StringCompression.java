package Practice_Session.Strings;

import java.util.Scanner;

public class StringCompression {
    public static String compressString(String st){ // keep on hold
        int[] alFreq = new int[26];
        for(int i = 0; i<st.length(); i++){
            alFreq[st.charAt(i)-'a']++;
        }
        // now actually answer seving time
        StringBuilder sb = new StringBuilder("");
        for(int i =0; i<26; i++){
            // System.out.print((char)(97+i)+" ");
           if(alFreq[i]>0){
            //  sb.append((char)97+i);
             sb.append((char)alFreq[i]);
           }
        }
        return sb.toString();
    }

    public static String compress(String st){//O(n)
        StringBuilder sb = new StringBuilder("");
        Integer count = 0;
        int n = st.length();
        for(int i = 0; i<n; i++){
             // get curr character
             char ch = st.charAt(i);
             count = 1;
             while (i<n-1 && st.charAt(i+1) == ch) {
                 count++;
                 i++;
             }
             sb.append(ch);
             if(count>1) sb.append(count);
        }
        return sb.toString();
    }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    System.out.print("Enter a string : ");
    String s = sc.nextLine();
    System.out.println("After compression,new String is : "+compress(s));
  }
}
