package Practice_Session.Recurrsion;

import java.util.Scanner;

// Problem - Tower of Hanoi---> N disks are transfer from srcT to dstT,using helperTower
public class TOH {

  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the no. of disk : ");    
     int n = sc.nextInt();
     System.out.println("Steps to follow to transfer "+n+" disks from srcTower to dstTower,using helpTower");
     System.out.println("\n SrcTower    DstTower    HelpTower ");
     towerOfHanoi(n, 'S', 'H', 'D');
  }
  static void towerOfHanoi(int n,char srcT,char helpT,char dstT){
    // base condition 
    if(n==0) return;

    // steps 
    // step-1 ==> transfer n-1 disks from src to helper(i.e dst) ,using dstT as helper
    towerOfHanoi(n-1, srcT,dstT,helpT);
    // step-2 ==> transfer single disk directly from srcT to dstT,without using helpT
    System.out.println("    "+srcT+" ----->  "+dstT+"   ,using----> "+ helpT);
    // step-3 ==> transfer rest n-1 disks from helpT(i.e src) to dstT,using srcT as helper
    towerOfHanoi(n-1,helpT,srcT, dstT);
  }
}
