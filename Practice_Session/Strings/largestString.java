package Practice_Session.Strings;

public class largestString { // find a largest string among a given set of strings
 // it is lexicographical
  public static String getLargestString(String []sos){
    // done by using compareTo() method 
    String large = sos[0];
    for(int i = 1; i<sos.length; i++){
        if(large.compareTo(sos[i])<0) large = sos[i];
    }

    return large;
  }
 public static void main(String[] args) {
    String[] Fruits = {"apple","carrot","papaya","banana","mango","pomeogrante"};
    System.out.println("Largest string among the given set of strings : "+getLargestString(Fruits));
 }    
}
