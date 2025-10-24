package Practice_Session.Recurrsion;

import java.util.Scanner;

// Permutation of given string
public class String_Permutaion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String st = sc.next();
        System.out.println("Possible output of permutation of string "+st);
        permutation("", st);
    }
    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        // kaam
        for(int i = 0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f+up.charAt(0)+s, up.substring(1));
        }
    }
}
