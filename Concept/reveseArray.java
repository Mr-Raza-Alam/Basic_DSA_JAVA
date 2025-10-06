package Concept;
import java.util.*;
public class reveseArray {
    public static void getReverse(int mark[],int size){
        int start = 0,end = size -1,temp;
        while(start <=end){
                temp = mark[start];
                mark[start] = mark[end];
                mark[end] = temp;
                start++;
                end--;
          }        
       }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array = ");
        int size = sc.nextInt();
       
        int mark[] = new int[size];
        System.out.println("Enter the data to store in the list ");
        for(int i = 0; i<size; i++){
            int data = sc.nextInt();
            mark[i] = data;
         }
         System.out.println("The given values are in Reverse order :-");
         getReverse(mark, size);
         for(int i =0; i<size; i++){
            System.out.print(mark[i] + " ");
         }
     }
}
