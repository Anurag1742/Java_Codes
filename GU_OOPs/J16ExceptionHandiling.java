package GU_OOPs;

import java.util.Scanner;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class J16ExceptionHandiling {

    // Method that throws a custom exception
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking input
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            // Calling method that may throw exception
            checkAge(age);

        } catch (InvalidAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("General Exception: " + e);

        } finally {
            // This block always executes
            System.out.println("Execution completed. Thank you!");
            sc.close();
        }
    }
}
