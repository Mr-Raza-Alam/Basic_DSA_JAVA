package Concept;
import java.util.Arrays;

public class SampleTest {
    public static void main(String[] args) {// args is a command-line arguments
         int[] arr = new int[5];
        System.out.println("The default values of arr: " +arr); // arr--> is the address of reference variable(i.e object),but to print the actual array then ,convert it to a string
        System.out.println(Arrays.toString(arr));

        // Ensure at least 3 elements are present
        if (args.length < 3) {
            System.out.println("Please provide at least 3 command-line arguments!");
            return;
        }

        // modify arguments
        args[0] = "CodeSpartan";
        args[1] = "CodeSpark";
        args[2] = "CodeX";

        System.out.println("The length of command-line argument: " + args.length);
        System.out.println("And its values: " + Arrays.toString(args));


    }
    
}
