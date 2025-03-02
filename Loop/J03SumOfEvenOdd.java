package Loop;

public class J03SumOfEvenOdd {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        int sum1 = 0;
        for (i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            } else {
                sum1 = sum1 + i;
            }
        }
        System.out.println("Sum of Even numbers is : " + sum);
        System.out.println("Sum of Odd numbers is : " + sum1);
    }
}
