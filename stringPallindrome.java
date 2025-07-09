import java.util.*;
public class stringPallindrome {
  public static boolean isPallindrome(String str){
    int n = str.length();
    for(int i =0; i<str.length()/2; i++){   
       if(str.charAt(i) != str.charAt(n-1-i)){//O(n)
        // not Pallindrome;
          return false;
       }
    }
    return true;
  }
  public static  void main(String args[]){
   //Pallindrome check 
   String str = "WNN";
   System.out.println(isPallindrome(str));
   System.out.println("The shortest path = "+getShortestPath(str));
  }
  public static float getShortestPath(String path){
      int x = 0,y = 0;
      for(int i = 0; i<path.length(); i++){//O(path.length());
          //South
         char dir = path.charAt(i);
         if(dir =='S'){
           y--;
         }
        else if(dir == 'N'){//North
          y++;
        }
        else if(dir == 'W'){//West
          x--;
        }
        else if(dir =='E'){//East
          x++;
        }
       }
  int sd = (x*x + y*y);

    return (float)Math.sqrt(sd); 
  }
}
