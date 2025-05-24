    import java.util.Arrays;

public class J36SortAscDec {
    public static void SortNElement(int[] arr, int n) {
        int length = arr.length;

        // Sort n element in ascending order
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Sort after n in decending order
        for (int i = n + 1; i < length - 1; i++) {
            for (int j = n + 1; j < length - 1 - (i - (n + 1)); j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 3, 4, 2, 1 };
        SortNElement(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
