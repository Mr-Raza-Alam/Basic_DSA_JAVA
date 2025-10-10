package Practice_Session.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// This algorithm is to find out the given target element in the sorted matrix , in O(log(m*n)) time
public class rowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                         {5,9,11,18},
                         {7,13,15,21},
                         {10,14,19,25},
                         {12,16,20,32},
                         {17,23,29,36},
                     };
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a target value : ");
        int target = sc.nextInt();
       System.out.println(target+" is found at : "+Arrays.toString(search(matrix, target)));
    }

    static int[] search(int[][] matrix,int target){
        int rows = matrix.length,cols = matrix[0].length; // here ,we have taken cMid i.e column mid
        // before to evaluate , let check out the edge case
         if(rows == 1) return binSearch(matrix, 0, 0, cols-1, target);
        // apply BinSearch() for more than 1-row in the matrix

        // first reduce the search space
        int rStart = 0,rEnd = rows-1,cMid = cols/2,mid;

        while (rStart<(rEnd-1)){ 
            mid = rStart + (rEnd-rStart)/2;
            if(matrix[mid][cMid]==target) return new int[]{mid,cMid}; // target is found
            else if(matrix[mid][cMid]<target) rEnd = mid;
            else rStart = mid;
        }
      //  here now, we have half(2) require remaining martix part for search
      // so ,first check At,cMid , wheather the target is avialable in col of 2rows
      if(matrix[rStart][cMid] == target) return new int[]{rStart,cMid};
      else if(matrix[rStart+1][cMid] == target) return new int[]{rStart+1,cMid}; // where rEnd = rStart+1
      else{ // consider 4 parts separately

      // search in part-1
       if(target<=matrix[rStart][cMid-1]) return binSearch(matrix, rStart, 0,cMid-1, target);

     // else search in part-2
      else if(target>=matrix[rStart][cMid+1]&& target<= matrix[rStart][cols-1])  return binSearch(matrix, rStart, cMid+1,cols-1, target);

     // else search in part-3 i.e rEnd
      else if(target<=matrix[rStart+1][cMid-1]) return binSearch(matrix, rStart+1,0, cMid-1, target);      

     // else search in part-4 i.e rEnd = rStart+!
      else  return binSearch(matrix, rStart+1, cMid+1,cols-1, target);
      }
    }

    static int[] binSearch(int[][]matrix,int r,int cStart,int cEnd,int target){
         int mid = 0;
        while (cStart<=cEnd){
            mid = cStart + (cEnd-cStart)/2;
            if(matrix[r][mid] == target) return new int[]{r,mid};
            else if(matrix[r][mid] < target) cStart = mid+1;
            else cEnd = mid-1;
        }
        return new int[]{-1,-1};
    }
}
