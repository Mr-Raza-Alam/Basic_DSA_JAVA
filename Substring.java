
public class Substring {
  public static String getSubstring(String str, int si,int ei){
      String subStr  = "";
      for(int i = si; i<ei; i++){
          subStr += str.charAt(i);
      }
      return subStr;
  }
    public static void main(String args[]){
      String str = "applebhai";
      // using inbuilt fuction
      System.out.println(str.substring(4,7));
      //System.out.println("The sub-String of given string is:- "+getSubstring(str,2,5));
    }
    
}
