package Concept;
import java.util.*;
public class linearSearch {
    public static String LinSearch(String menuItem[],String key){// O(n)
        
     for(String item : menuItem){
        if(item.equals(key)) return item;
     }
        return ("not");
      }
    
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String menuItem[] = {"Dosa","Itly","Jalebi","Kakdha","Samosa","Chola-Bhatura","Rasogulla"};
    System.out.print("Enter the key item here = ");
     String key = sc.next(),index = LinSearch(menuItem, key) ;
    if(index == "not"){
        System.out.println("Not found");
    }else{
    System.out.println(key +" is found");
}
  }
}
 
