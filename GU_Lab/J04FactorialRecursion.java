package GU_Lab;

import java.util.Scanner;

public class J04FactorialRecursion {
    public static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = Factorial(num);
                    System.out.println("Factorial of " + num + " is " + Factorial(num));
        }
        sc.close();
    }
}
