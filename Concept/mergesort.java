package Concept;
import java.util.*;
public class mergesort {
 public static void conqure(int arr[],int si,int mid,int ei){
    int merged[] = new int[ei-si +1];//create a new merged array to store sorted element in it;
    int idx1 = si;
    int idx2 = mid+1;
    int x = 0;
    while(idx1<=mid && idx2<=ei){
        if(arr[idx1]<=arr[idx2]){
            merged[x++] = arr[idx1++];
        }
        else{
            merged[x++] = arr[idx2++];
        }
    }
  while(idx1<=mid){
    merged[x++] = arr[idx1++];
  }
  while(idx2<=ei){
    merged[x++] = arr[idx2++];
  }
  //copy all merged sorted into original array i.e. in arr[]
  for(int i = 0,j= si; j<merged.length; i++,j++){
    arr[j] = merged[i];
  }
 }

  public static void divide(int arr[],int si,int ei){
     if(si>=ei){//single element comes
        return;
     }
     //else then cal. mid of divide the array into small or single element for sorting purpose in easy way
    int mid = si + (ei-si)/2;//why not (mid = ei+si)/2? b/c si and ei both become big value then mid will out of bound
    divide(arr, si, mid);
    divide(arr, mid+1,ei);
    //conqure
    conqure(arr,si,mid,ei);
  }
 public static void main(String args[]){
  // Scanner sc = new Scanner(System.in);
  // System.out.print("Enter the array's size = ");
  // int size = sc.nextInt();
  // int arr[] = new int[size];//array declaration of size = size
  // System.out.println("Enter the value to store in the  given array");
  // for(int i = 0; i<size; i++){
  //    int a = sc.nextInt();
  //    arr[i] = a;
  // }
  int arr[] ={6,3,9,5,2,8};
  int size = arr.length;
  divide(arr,0,size-1);
  System.out.println("After the Merged sort,the new updated value are given below");
  for(int i = 0; i<size; i++){
    System.out.print(arr[i] + " ");
  }
  System.out.println();
 }
}
