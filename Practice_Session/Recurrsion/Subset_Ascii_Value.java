package Practice_Session.Recurrsion;

import java.util.ArrayList;
import java.util.Scanner;

public class Subset_Ascii_Value {

    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in)        ;
       System.out.print("Enter a string : ");
       String st = sc.next();
      System.out.println("Possible subset of the string with their Ascii value "+st+" = "+subSet("", st, new ArrayList<>(),""));
    }
    
    static ArrayList<String> subSet(String sb,String st,ArrayList<String> list,String ascii){ // This one when AL is an Argument
        
        if(st.isEmpty()){               
            list.add(sb+"->"+ascii);
            return list;
        }
        
        list =  subSet(sb+st.charAt(0), st.substring(1), list,ascii+(st.charAt(0)+0)); // Left-Subtree
        return subSet(sb, st.substring(1), list,ascii); // Right-Subtree
    }

    static void printSubsetAscii(String st,String sb){
        if(st.isEmpty()){
            System.out.print(sb+" ");
            return;
           }
    // kaam
    // 1) Choice-1 : Take an element
     printSubsetAscii(st.substring(1), sb+st.charAt(0)); 
     // 2) Choice-2 : Leave that element
     printSubsetAscii(st.substring(1), sb);     
     //3) Choice-3 : For ascii value of each substring
     printSubsetAscii(st.substring(1), sb+(st.charAt(0)+0)); 


    }
}