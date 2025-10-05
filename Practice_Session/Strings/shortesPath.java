package Practice_Session.Strings;

import java.util.Scanner;

public class shortesPath { // find the shortest path from the given route to reach destination
    public static float getShortestPath(String path){
        int x = 0,y = 0; // here x-coordinate, y-coordinate
        for(int i = 0; i<path.length(); i++){
          if(path.charAt(i) == 'W') x--;
          else if(path.charAt(i) == 'E') x++;
          else if(path.charAt(i) == 'S') y--; 
          else if(path.charAt(i) == 'N') y++;
          else{
            System.out.println("Invalid Direction.");
            return 0;
          }
        }
       System.out.println("X-coordinate : "+x);
       System.out.println("Y-coordinate : "+y);
        return (float)Math.sqrt(x*x + y*y);
    }
   public static void main(String[] args) {
    // The route give in String formate
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a route : ");
    String s = sc.next();
    System.out.println("The shortest Path to reach the destination : "+getShortestPath(s));
   } 
    
}
