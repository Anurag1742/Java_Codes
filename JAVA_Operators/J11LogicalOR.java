package JAVA_Operators;

public class J11LogicalOR {
    public static void main(String[] args) {
        int a = 10, b = 20;
        if ((a > 5) || (++b < 10)) {
            System.out.println("True");
        }
        System.out.println("b = " + b);

        if((a > 5) || (++b > 10)) {
            System.out.println("True");
        }
        System.out.println("b = " + ++b);
    }
}
