package Loop;

public class J18ForeachLoop2 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        for (int x : arr) {
            System.out.print(x + " ");
            x = x * 10;
        }
        System.out.println();

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
