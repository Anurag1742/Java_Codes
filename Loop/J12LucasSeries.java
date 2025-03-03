package Loop;

public class J12LucasSeries {
    public static void main(String[] args) {
        int n, i, a = 1, b = 1, c = 1, d;
        n = 10;
        System.out.print(" " + a + " " + b + " " + c);
        for (i = 1; i <= (n - 3); i++) {
            d = a + b + c;
            System.out.print(" " + d);
            a = b;
            b = c;
            c = d;
        }
    }
}
