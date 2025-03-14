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

/*
 * Third largest number second method
 * package Arrays;
// Java program to find second largest element in an array

// using Sorting

import java.util.Arrays;

public class J06ThirdLargestNum {
    // Java program to find second largest element in an array
    // using Sorting

    // function to find the second largest element
    static int getSecondLargest(int[] arr) {
        int n = arr.length;

        // Sort the array in non-decreasing order
        Arrays.sort(arr);

        // start from second last element as last element is the largest
        for (int i = n - 3; i >= 0; i--) {

            // return the first element which is not equal to the
            // largest element
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }

        // If no second largest element was found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 39, 1 };
        System.out.println(getSecondLargest(arr));
    }

}
 */
