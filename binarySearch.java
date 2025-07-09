import java.util.*;
public class binarySearch {
    public static int sorting(int mark[],int key){
        int temp,j,ans;
        for(int i =1 ; i<mark.length; i++){
             j = i;
             while(j>0 && (mark[j-1]>mark[j])){
                 temp = mark[j-1];
                 mark[j-1] = mark[j];
                 mark[j] = temp;
                 j--;
               }
            }
     
    System.out.println("\nThe mark in ascending order is:-");
      for(int i =0; i<mark.length; i++){
        System.out.print(mark[i] + " ");
      }
      ans = binSearch(mark, key);
      return ans;
    }
 public static void main(String srgs[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of an array = ");
    int size = sc.nextInt();
    System.out.print("Enter the key item/value = ");
    int key = sc.nextInt();
    int mark[] = new int[size];
    System.out.println("Enter the data to store in the list ");
    for(int i = 0; i<size; i++){
        int data = sc.nextInt();
        mark[i] = data;
    }
      int res =  sorting(mark,key);
      System.out.println("\nThe item/value stored at index = " + res);
      
 }
 public static int binSearch(int mark[],int key){
     int start = 0,end = (mark.length -1),mid;
     while(start <=end){
       mid = (start + end)/2;
       if(mark[mid]==key){
          return mid;
       }
       else if(mark[mid]>key){//left search from mid-point
            end = mid-1;
       }
       else if(mark[mid]<key){//right search from mid-point
         start = mid+1;
       }
      }
      return -1;
   }
}
