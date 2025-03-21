package Arrays;
import java.util.Arrays;
public class J20RemoveAllOccurrences {
    // Java Code to remove all occurrences of 
// an element in an array

    static int removeElement(int[] arr, int ele) {
  
        // Initialize the counter for the 
        // elements not equal to ele    
        int k = 0;
        for (int i = 0; i < arr.length; i++) {

            // Place the element which is not 
            // equal to ele at the kth position
            if (arr[i] != ele) {
                arr[k] = arr[i];  
                
                // Increment the count of 
                // elements not equal to ele
                k++;             
            }              
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 0, 2, 2, 4, 2};
        int ele = 2;
        System.out.println(removeElement(arr, ele));
    }
}