package Concept;
import java.util.Arrays;

public class Anagrams {
 public static boolean getAnagrams(String s1,String s2){//need some improvement
    boolean isHai = false;  
    if(s1.length() == s2.length()){
        for(int i = 0; i<s1.length(); i++){
            for(int j = 0; j<s2.length(); j++){
               if(s1.charAt(i) == s2.charAt(j)){
                isHai = true;
               }
            }
            isHai = false;
        }
      }

    return isHai;
 }
 public static void main(String args[]){
    String str1 = "race";
    String str2 = "azar";
    if(str1.length() == str2.length()){
        // creat char Arrays from given strings 
        char content1[] = str1.toCharArray();
        char content2[] = str2.toCharArray();
        //sort the content1 and content2
        Arrays.sort(content1);
        Arrays.sort(content2);
        //check wheteher contents are equal or not
        boolean result = Arrays.equals(content1,content2);
      if(result){
      System.out.println("True , Anagrams is present");
      }
    else{
    System.out.println("False,Anagrams is absent");
    }
  }
}
    
}
