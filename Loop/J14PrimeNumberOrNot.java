package Loop;

public class J14PrimeNumberOrNot {
    public static void main(String[] args) {
        int i, n;
        boolean flag = true;
        n = 29;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.print("\nThe Number " + n + " is a Prime Number.");
        } else {
            System.out.print("\nThe Number " + n + " is Not a Prime Number.");
        }
    }
}
