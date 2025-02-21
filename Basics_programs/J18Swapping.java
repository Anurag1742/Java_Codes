package Basics_programs;

public class J18Swapping {
    public static void main(String[] args) {
        int a, b;       // without using third variable

        a = 10;
        b = 20;
        System.out.println("\nBefore swapping: a = " + a + " and b = " + b);

        a = a + b;  
        b = a - b;
        a = a - b;
        System.out.println("\nAfter swapping: a = " + a + " and b = " + b);
    }
}
