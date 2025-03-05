package Arrays;

public class J11ArrayIndexing {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Accessing elements using indexing
        System.out.println("First element: " + numbers[0]); // Output: 10
        System.out.println("Second element: " + numbers[1]); // Output: 20
        System.out.println("Third element: " + numbers[2]); // Output: 30

        // Modifying an element using indexing
        numbers[3] = 100;
        System.out.println("Modified Fourth element: " + numbers[3]); // Output: 100

        // Finding the length of the array
        System.out.println("Array length: " + numbers.length); // Output: 5

        // Using a loop to print all elements
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
