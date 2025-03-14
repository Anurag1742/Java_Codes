package Arrays;

import java.util.*;

public class J06ThirdLargestNum {
    // Java program to find the third largest
    // element in an array.

    static int thirdLargest(int[] arr) {
        int n = arr.length;

        // Sort the array
        Arrays.sort(arr);

        // Return the third largest element
        return arr[n - 3];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 14, 2, 16, 10, 20 };
        System.out.println(thirdLargest(arr));
    }
}
