  import java.util.*;
public class test2 {
    public static void getProduct(int nums[],int size){
        int p = 1,t=1,i; 
        for(i =0; i<size; i++){
            if(nums[i]!=0){
                  p *=nums[i];
               }
            else{
                t = i;
            }
        }
        System.out.println("Nums["+t+"] = "+nums[t]);
        System.out.println("The total product of given elements = "+p);
        if(nums[t]==0){
            for(int k = 0; k<size; k++){//n times run hua hai
                if(k==t){
                    nums[t] = p;
                }
                else{
                    nums[k] = 0;
                }
            }
        }
        else{
       for(int j =0; j<size; j++){//n times run hua hai
        if(nums[j] != 0){
            nums[j] = p/nums[j];                        
          }
        }
      }
    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the array's size = ");
         int size = sc.nextInt();
         int nums[] = new int[size];
         System.out.println("Enter the value to store in the array");
         for(int i = 0; i<size; i++){
            int a = sc.nextInt();
            nums[i]= a; 
         }
         getProduct(nums, size);
         for(int i =0; i<size; i++){
            System.out.print(nums[i] + " ");
         }

        //    System.out.println("****");
        //    System.out.println("***");
        //    System.out.println("**");
        //    System.out.println("*");
        //    System.out.println("now next");
        //    int i =1,n =5,j;
        //    while (i<=n) {
        //     for(j = i; j<=n; j++){
        //         System.err.print(" * ");
        //     }
        //     System.out.print("\n");
        //     i++;
        //    }

        // int a = 10;
        // int b = 60;
        // System.out.println(a);
        // String name = "Spider-Man";
        // System.out.println(name);
        // System.out.println(b);
        // a = b;
        // System.out.println(a);

    }
}
