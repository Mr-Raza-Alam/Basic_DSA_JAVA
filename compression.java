public class compression {
  public static String toCompressedString(String str){
     StringBuilder sb = new StringBuilder("");
     for(int i = 0; i<str.length(); i++){//o(n)
         Integer count = 1;  // here we use object int type for toSting function use
         while(i<str.length() -1 && str.charAt(i) == str.charAt(i + 1)){
             count++;
             i++;           
            }
        sb.append(str.charAt(i));
      if(count>1){
           sb.append(count.toString());
          }
    }
     return sb.toString();
  }
 public static void main(String args[]){
        String str = "aaaaaabbbbbcccdddd";
        System.out.println("The compressed string is :- "+ toCompressedString(str));

 }
    
}
