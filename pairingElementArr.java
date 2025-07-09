import java.util.*;
public class pairingElementArr { 
    public static void getPairing(int Arr[],int size){
        for(int i =0; i<size; i++){
            for(int j= i+1; j<size; j++){
                if(j == i+1){
                    System.out.print("(" + Arr[i]+","+Arr[j]+")");
                }else{
                System.out.print(",(" + Arr[i]+","+Arr[j]+")");
                }
            }
            System.out.println();
        }
    }
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of an array = ");
    int size = sc.nextInt();
   
    int Arr[] = new int[size];
    System.out.println("Enter the data to store in the list ");
    for(int i = 0; i<size; i++){
        int data = sc.nextInt();
        Arr[i] = data;
     }
     getPairing(Arr, size);
 }
}
