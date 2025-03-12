package GU_Lab;
import java.util.Scanner;
public class J02SumOfEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;
        System.out.print("Enter range of the number: ");
        int start = sc.nextInt();
        System.out.print("Enter range of the number: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("Sum of Even number: " + sumEven);
        System.out.println("Sum of Odd number: " + sumOdd);
    }

}