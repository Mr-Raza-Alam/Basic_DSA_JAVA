package Concept;
import java.util.*;
public class largestNum { 
 public static int getLargest(int number[]){
      int largest = Integer.MIN_VALUE;//i.e -Infinity
      int smallest = Integer.MAX_VALUE;//i.
    for(int i =0; i<number.length; i++){
       if(number[i]>largest){
        largest = number[i];
       }
       else if(smallest>number[i]){
        smallest = number[i];
       }
    }
    System.out.println("The smallest element = "+smallest);
    return largest;
}
 public static void main(String num[]){
     Scanner sc = new Scanner(System.in);
     int number[] = {4,6,2,9,7,1,3};
     System.out.println("The largest element = "+getLargest(number));
 }
}
