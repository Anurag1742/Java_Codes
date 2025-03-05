package Arrays;

import java.util.Scanner;

public class J10CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define the array
        int[] numbers = {1, 2, 3, 4, 2, 5, 2, 6, 7, 2, 8};
        
        // Ask the user for the number to count
        System.out.print("Enter the number to count: ");
        int target = scanner.nextInt();
        
        // Count occurrences
        int count = 0;
        for (int num : numbers) {
            if (num == target) {
                count++;
            }
        }
        
        // Display the result
        System.out.println("The number " + target + " appears " + count + " times in the array.");
        
        scanner.close();
    }
}
