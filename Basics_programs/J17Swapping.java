package Basics_programs;

public class J17Swapping {
    public static void main(String[] args) {
        int a, b, t;        // using third variable
        a = 10;
        b = 20;
        System.out.println("\nBefore swapping: a = " + a + " and b = " + b);

        t = a;
        a = b;  
        b = t;
        System.out.println("\nAfter swapping: a = " + a + " and b = " + b);
    }
}
