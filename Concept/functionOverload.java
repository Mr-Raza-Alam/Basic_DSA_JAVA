package Concept;
import java.util.*;
public class functionOverload {
    public static  int sum(int n,int m , int k){
        return (n + m + k);
    }
    public static  float sum(float n,float m , float k){
        return (n + m + k);
    }
    public static void main(String args[]){ 
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value for a = ");
       int a = sc.nextInt();
       System.out.print("Enter the value for x = ");
       float x = sc.nextFloat();
       System.out.print("Enter the value for d = ");
       int d = sc.nextInt();
       System.out.print("Enter the value for y = ");
       float y = sc.nextFloat();
       System.out.print("Enter the value for c = ");
       int c = sc.nextInt();
       System.out.print("Enter the value for z = ");
       float z = sc.nextFloat();
       System.out.println("The sum-1 of int = " + sum(a,d));
       System.out.println("The sum-1 of float = " + sum(x,y));
       System.out.println("The sum-2 of 3 int var = " + sum(a,d,c));
       System.out.println("The sum-2 of 3 float var =  " + sum(x,y,z));

    }
    public static  int sum(int n,int m){
        return (n + m);
    }
    public static float sum(float p,float q){
        return (p + q);
    }
    
    
}
