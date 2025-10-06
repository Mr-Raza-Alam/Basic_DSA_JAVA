package Concept;
public class code_nation {
    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i = 1;i<str.length(); i++){//O(n)  
            if(str.charAt(i) == ' ' && i<str.length() -1){
                sb.append(str.charAt(i));//append space;
                i++;//on next non-space character
                ch = Character.toUpperCase(str.charAt(i));//change toUpperCase 
                sb.append(ch);//here append to sb 
            }
            else{
                sb.append(str.charAt(i));
            }
        }
      return sb.toString();// sb to string
    }
 public static void main(String args[]){
  String str = "hi,i am shradha";
   System.out.println("The new string is :-\n"+toUppercase(str));
}
}
