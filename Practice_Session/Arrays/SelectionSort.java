package Practice_Session.Arrays;
 // selection sort --> idea is, to select an element and put it to its correct idex w.r.t sorting order(either Asc. or Decs.)
public class SelectionSort {
    public static void main(String[] args) {
       int[]arr={8,10,2,5,7};
        System.out.println("Before sorting,original Array ");
        for(int val:arr) System.out.print(val+" ");       
        // sort the array,using selectionSort Algorithm
        selectionSort(arr);
        // here now ,we have sorted array
        System.out.println("\nAfter sorting,original Array ");
        for(int val:arr) System.out.print(val+" ");
    }
    static int maxElement(int[]arr,int endPoint){//O(n)
         int maxEle = Integer.MIN_VALUE,idx = -1;

        for(int i = 0; i<arr.length-endPoint; i++){
              if(maxEle<arr[i]){
                maxEle = arr[i];
                idx = i;
              }
        }
        int actualIdx = arr.length-1-endPoint;
        return maxEle!=arr[actualIdx]?idx:-1; // -1 why b/c if maxEle is on its correct index
    }

    static void selectionSort(int[]arr){
          int currIdx =-1,i = 0;
           while(true){
            if(i==arr.length) return;
             currIdx = maxElement(arr,i); // get the index of maxElement
             // now place maxElement on its correct position i.e arr.length-1-i;
            if(currIdx!=-1)swapp(arr,currIdx,arr.length-1-i);  //  swapp(arr[currIdx],arr[corrIdx]),corrIdx = arr.length-1-i; 
            i++;                
        }
    }
    
    static void swapp(int[]arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
