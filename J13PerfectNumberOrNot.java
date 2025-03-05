public class J13PerfectNumberOrNot {
    public static void main(String[] args) {
        int i, t, n, sum;
        n = 28;
        sum = 0;
        for (i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (n == sum) {
            System.out.println("\nThe Number " + n + " is a Perfect Number.");
        } else {
            System.out.println("\nThe Number " + n + " is Not a Perfect Number.");
        }
    }
}
