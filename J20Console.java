import java.io.*;

public class J20Console {
    public static void main(String[] args) {
        Console cn = System.console();
        int n;
        System.out.print("Enter a number : ");
        n = Integer.parseInt(cn.readLine());
        System.out.println("The given number is : " + n);
    }
}
