package Loop;

public class J05Pattern_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int j = i;
            while (j <= 5) {
                System.out.print("* ");
                j++;
            }
            System.out.println(" ");
        }
    }
}
