package Concept;
public class operaterinjava {
 public static void main(String[] args){
    //chapter-3 --->ques no .1
    //    int x = 2,y = 5;
    //    int exp1 = (x*y/x);
    //    int exp2 = (x*(y/x));
    //    System.out.println(exp1+",");
    //    System.out.println("Expression2 = "+ exp2);//here integer 5 ---> string then + Expression = 5 //here only string catenation occurs
   
    // ques no.3
    // int x,y,z;
    // x=y=z=2;//it is valid in java like maths 
    // x +=y;// x= x+y ==> x = 4
    // y -=z; //y = y-z ==> y =0
    // z /=(x+y); // z = z/(x=y) ==> z = 0
    // System.out.println(x + " " + y + " " + z);

    //ques no.4
    int x = 9,y =12;
    int a =2, b =4, c = 6;
    int exp = 4/3 * (x +34) + 9 * (a + b *c) + (3 + y * (2 + a)) / (a + b*y);
    System.out.println("Expression = " + exp);
 }
    
}
