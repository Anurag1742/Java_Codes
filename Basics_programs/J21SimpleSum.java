package Basics_programs;

public class J21SimpleSum {
    public static void main(String args[]) {
        // Simple sum of two numbers using command line
        int num1, num2, sum;

        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1]);

        sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
