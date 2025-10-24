package Practice_Session.Recurrsion;
import java.util.ArrayList;
// Subsets problem 
// In this,we generally take an element or leave an element so,Every element have only 2 choice 
import java.util.Scanner;
public class Subsets {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in)        ;
       System.out.print("Enter a string : ");
       String st = sc.next();
      System.out.println("Possible subset of the string "+st+" = "+subSet("", st, new ArrayList<>()));
    //   for(String subst : subSet("", st, new ArrayList<>()) ) System.out.print(subst+" ");
        // printSubsets(st, "");

    }

    static void printSubsets(String st,String sb){
        if(st.isEmpty()){
            System.out.print(sb+" ");
            return;
           }
    // kaam
    // 1) Choice-1 : Take an element
     printSubsets(st.substring(1), sb+st.charAt(0)); 
     // 2) Choice-2 : Leave that element
     printSubsets(st.substring(1), sb);     

    }

    static ArrayList<String> subSet(String sb,String st,ArrayList<String> list){ // This one when AL is an Argument
        
        if(st.isEmpty()){               
            list.add(sb);
            return list;
        }
        
        list =  subSet(sb+st.charAt(0), st.substring(1), list);
        return subSet(sb, st.substring(1), list);
    }
  // what if, AL is local varialble of Function subSet
     

    static ArrayList<String> subSet2(String sb,String st){ // This one when AL is an Argument
        
        if(st.isEmpty()){               
            ArrayList<String> list = new ArrayList<>();
            list.add(sb);
            return list;
        }
        
        ArrayList<String> left =  subSet2(sb+st.charAt(0), st.substring(1));
        ArrayList<String> right =  subSet2(sb, st.substring(1));
         left.addAll(right);
         return left;
    }
}
