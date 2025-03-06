package Loop;

public class J17ForeachLoop {
    public static void main(String[] args) {
        int arrayname[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21 };

        // Learn
        for (int val : arrayname) {
            System.out.print(" " + val);
        }
        System.out.println();

        // explore
        for (float val : arrayname) {
            System.out.print(" " + val);
        }
        System.out.println();

        for (double val : arrayname) {
            System.out.print(" " + val);
        }
    }
}
