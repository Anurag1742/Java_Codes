package Loop;

public class J19WhileLoop {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 5) {
            System.out.print(" " + a);
            a++;
        }

        int sum = 0, b = 1;
        while (b <= 5) {
            sum += b;
            b++;
        }
        System.out.println("\nSum of 1-5 is " + sum);
    }
}
