package Concept;
public class stringbuilder {
 public static void main(String args[]){
// find out largest string from given string array
    String fruite[] = {"apple","mango","banana","papaya"};
  //    indices---->      0        1        2        3
    String str = fruite[0];
    //compare str with other fruite's name
    for(int i = 0; i<fruite.length;i++){
        if(str.compareTo(fruite[i])<0){
         System.out.println(str + " = " +str.compareTo(fruite[i]));
            str = fruite[i];
        }
    }
    System.out.println("The largest fruit's name = " + str);
    // use setbuilder 
    StringBuilder str2 =new StringBuilder("");//""-->this means is null string or nothing like 0 in int array
    System.out.println(str2);// it print a space i.e. null character
    for(char ch = 'a'; ch<='z'; ch++){//O(26) but in case of string declarative method T/C approx = O(n^2)
          str2.append(ch);
    }
    System.out.println("The new string is given below\n" + str2);
  }
}
