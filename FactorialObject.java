import java.util.Scanner;

public class FactorialObject {
    int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        // Creating an object of the class
        FactorialObject obj = new FactorialObject();
        
        // Calling the non-static factorial method using the object
        int result = obj.factorial(num);
        
        System.out.println("Factorial of " + num + " is " + result);
    }
}
