package Arrays;

import java.util.*;

public class J04ReadPrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter elements of Array: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enterered Array's Element: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + " Element: " + arr[i]);
        }
    }
}
