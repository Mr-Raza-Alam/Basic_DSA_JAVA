import java.util.*;
public class DS1Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
       System.out.println("The lenght of array = " + marks.length);
       System.out.println("Enter the values ");
       for(int i = 0; i<marks.length; i++){
            int a = sc.nextInt();
            marks[i] = a;
       }
       System.out.println("The values are store in the array ");
       for(int i = 0; i<marks.length; i++){
        System.out.print(marks[i]+" ");
       }

    }
    
}
