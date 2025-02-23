package JAVA_Operators;

public class J04Increment {
    public static void main(String[] args) {
        int a = 10, b = 20, c;

    c = (++a) + (++b);
    
    //a++ is post fix increment
    //++a is pre fix increment
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
        System.out.println("Value of c : " + c);
    
    }
    
}
