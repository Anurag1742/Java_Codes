package Basics_programs;

public class J06AreaOfTriangle {
    public static void main(String[] args) {
        double area, a, b, c, s;
        a = 3;
        b = 4;
        c = 5;

        s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle is " + area);
    }
    
}
