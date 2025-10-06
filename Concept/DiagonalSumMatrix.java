package Concept;
import java.util.*;
public class DiagonalSumMatrix {
    public static int getDiagonalSum(int matrix[][],int n,int m){//op1---> O(n)/op2 -->O(n^2)
        int sum = 0; 
        for(int i = 0; i<n; i++){
            //PD
            sum +=matrix[i][i];
            //SD
            if(i != (n-1-i)){
            sum += matrix[i][n-1-i];
            }
       }
      

        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<m; j++){
        //         if(i == j){
        //             sum +=matrix[i][j];
        //         }
        //       else if(i+j == n-1-i){
        //         sum +=matrix[i][j];
        //       }
        //     }
        // }     
        return sum;
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
    System.out.println("The sum of diagonals elements of given matrix = " + getDiagonalSum(matrix,n,m));
  }
}
