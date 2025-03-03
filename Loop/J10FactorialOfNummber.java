package Loop;

public class J10FactorialOfNummber {
    public static void main(String[] args) {
        int i, n;
        n = 5;
        int f = 1;
        for (i = n; i >= 1; i--) {
            f = f * i;
        }
        System.out.println("\nThe Factorial of " + n + " is = " + f);
    }
}
