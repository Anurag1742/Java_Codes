import java.util.*;  // Importing all utility classes (like Scanner, Set, HashSet)

public class RemoveDuplicates {

    // Method to remove duplicate characters from a string while preserving order
    public static String removeDuplicates(String input) {
        Set<Character> seen = new HashSet<>();          // To keep track of already seen characters
        StringBuilder result = new StringBuilder();     // To build the result string without duplicates

        // Iterate through each character in the input string
        for (char ch : input.toCharArray()) {
            // If character is not already seen, add it to the result and mark as seen
            if (!seen.contains(ch)) {
                seen.add(ch);           // Mark the character as seen
                result.append(ch);      // Append to result since it's the first time we see it
            }
        }

        // Return the final string with duplicates removed
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner object to read user input from console
        System.out.print("Enter a string: ");      // Prompt user for input
        String input = scanner.nextLine();         // Read full line of input

        String result = removeDuplicates(input);   // Call method to remove duplicates
        System.out.println("After removing duplicates: " + result);  // Print the result
    }
}
