package Arrays;

import java.util.Scanner;

public class J12BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // Taking input for the array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Bubble Sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap elements
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
