package Concept;
import java.util.*;
public class SearchinMatrix {
    public static boolean  getKeyElementStairS(int matrix[][],int n,int m,int key){
             //Right-top to left-bottom; row = 0, col = m-1 / op1
             //left-bottom to right-top; row = n-1, col = 0;
             int row = n-1, col = 0;
             while(row>=0 && col <m){// op1--> row <n && col>=0
               if(matrix[row][col] == key){
                System.out.println(key +"Found the " + " at (" + row +","+ col+")");
                 return true;
               }
             else if(matrix[row][col]>key){
                  row--;
             }
             else{
                col++;
             }
         }
            System.out.println("key Not Found!");      
            return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total no. of rows require to form a matrix = ");
        int n = sc.nextInt();
        System.out.print("Enter total no. of coloumns require to form a matrix = ");
        int m = sc.nextInt();
    
        int matrix[][] = new int[n][m];
        System.out.println("Enter your elements in the matrix ");
        for(int i = 0; i<matrix.length; i++){
          for(int j = 0; j<matrix[0].length; j++){
             matrix[i][j] = sc.nextInt();
          }
        }
        System.out.print("Enter the key elements to search in the given matrix = ");
        int key = sc.nextInt();
       System.out.print(getKeyElementStairS(matrix, n, m,key));
    }
}
