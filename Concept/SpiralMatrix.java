package Concept;
import java.util.*;
public class SpiralMatrix {
    public static void getSpiralElements(int matrix[][]){
     int startRow = 0,startCol = 0,endRow = 1,endCol = 3;
      while(startRow<=endRow && startCol <=endCol){
         // top - part
         for(int j = startCol; j<=endCol;j++){
            System.out.print(matrix[startRow][j] + " ");
         }

         // right-part
         for(int i = startRow + 1; i<=endRow; i++){
            System.out.print(matrix[i][endCol] + " ");
         }

         // bottome-part
         for(int j = endCol -1; j>=startCol; j--){
            if(startCol == endCol){
                break;
            }
            System.out.print(matrix[endRow][j] + " ");
         }

         //left-part
         for(int i = endRow -1; i>=startRow+1; i--){
            if(startRow == endRow){
                  break;
            }
            System.out.print(matrix[i][startCol] + " ");
         }
         startRow++;
         endRow--;
         startCol++;
         endCol--;
      }
    }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     int matrix[][] = new int[2][4];
     System.out.println("Enter your elements in the matrix ");
     for(int i = 0; i<matrix.length; i++){
       for(int j = 0; j<matrix[0].length; j++){
          matrix[i][j] = sc.nextInt();
       }
     }
     System.out.println("The matrix's element are in Spiral Mode is");
         getSpiralElements(matrix);
  }  
}
