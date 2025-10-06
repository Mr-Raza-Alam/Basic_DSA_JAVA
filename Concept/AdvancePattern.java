package Concept;
public class AdvancePattern {
 public static void solidRhombus(int n){
   for(int i = 1; i<=n; i++){
    for(int j = 1; j<=2*n-i; j++){
        if(j<=(n-i)){
         System.out.print(" ");
        } else{
          System.out.print("*")    ;
        }
    }
    System.out.println();
   }
 }

public static void getButterfly(int n){
 // 1st half
 for(int i = 1; i <=n; i++){//
    for(int j = 1; j<=2*n; j++){
      if(j >= (i+1) && j<=(2*n-i)){
        System.out.print(" ");
      } else{
       System.out.print("*");
      }
    }
   System.out.println();
 }
 for(int i = n; i>=1; i--){//
    for(int j = 1; j<=2*n; j++){
      if(j >= (i+1) && j<=(2*n-i)){
        System.out.print(" ");
      } else{
       System.out.print("*");
      }
    }
   System.out.println();
 }
}

    public static void  invertedHalfRotatedPyramid(int n){
        for(int i = 1; i<=n; i++){
          for(int j = 1; j<=n; j++){
            if((i + j)>= n+1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
          }
          System.out.println();
        }
    }

    public static void zeroOneTriangle(int n){
         for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
               if(((i+j) & 1 )== 0){//check (i + j) is even then print 1
                System.out.print(1 + " ");
               }else{//else print 0 if (i + j) is odd 
                System.out.print(0 + " ");
               }
            }
            System.out.println();
         }
    }

  public static void main(String[] args) {
    // diamond
    System.out.println("The pattern of Diamond is given below");
      diamond(7);
    // hollow solid-rhombus
    // System.out.println("The pattern of hollow solid Rhombus is given below");
    // hollowSolidRhombus(7);
    // solid Rhombus
    // System.out.println("The pattern of solid Rhombus is given below");
    //   solidRhombus(7);
    // butterfly
    // System.out.println("The pattern of Buttefly is given below");
    // getButterfly(7);
    // 0-1 Triangle
    // System.out.println("The pattern of 0-1 Triangle is given below");
    // zeroOneTriangle(7 );
    //floyd's triangle 
    // System.out.println("The pattern of FLOYD'S Triangle is given below");
    // getFloydTriangle(7  );
    //inverted half-pyramid with numbers
    // System.out.println("The pattern of inverted Half pyramid is given below");
    // invertedHalfPyramid(9 );
       // Hollow Rectangle 
//    System.out.println("The pattern of hollow rectangle is given below");
//     for(int i = 1; i<=5; i++){
//      for(int j = 1; j<=8; j++){
//         //cell->(i,j)
//         if(i == 1 || i == 5 || j == 1 || j==8){//boundry condition
//           System.out.print("* ");
//           }else{
//             System.out.print("  ");
//             }
//           }
//         System.out.println();
//       }
  
    // System.out.println("The pattern of inverted Half pyramid is given below");
    //  invertedHalfRotatedPyramid(7);
  }
  
  public static void diamond(int n){
    int nst = 1,nsp = n-1,mid = n;
    for(int i = 1; i<=2*n-1; i++){
      //print spaces
     for(int k = 1; k<=nsp; k++){
        System.out.print(" ");
     }
     // print stars
     for(int j = 1; j<=nst; j++){
        System.out.print("*");
     }
     System.out.println();
    if(i<mid){
        nst +=2;
        nsp--;
    } else{
      nst -= 2;
      nsp++;
     }
  }

}

  public static void hollowSolidRhombus(int n){
        for(int i =1; i<=n; i++){
            //spaces
         for(int j = 1; j<=n-i; j++){
            System.out.print(" ");
         }
         //hollow rectangle - stars
         for(int j = 1; j<=n; j++){
                   //cell->(i,j)
       if(i == 1 || i == n || j == 1 || j==n){//boundry condition
         System.out.print("* ");
         }else{
          System.out.print("  ");
             }
           }
        System.out.println();
        }
  }

  public static void  invertedHalfPyramid(int n){
     for(int i =1; i<=n; i++){
        for(int j =1; j<=n; j++){
            if((i+j)>=n+2){
             System.out.print(" ");
            }else{
                System.out.print(j+" ");
            }
        }
      System.out.println();
     }
  }
 
  public static void getFloydTriangle(int n){
      int count = 1; 
      for(int i = 1; i<=n; i++){
        for(int j= 1; j<=i; j++){
            System.out.print(count + " ");
            count++;
        }
       System.out.println();
      }
  }

}
