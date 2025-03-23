package Arrays;
import java.util.Arrays;

public class J22InsertDuplicate {



    public static int[] duplicateK(int[] arr, int k) {
        int n = arr.length;
        
        // Maximum size after duplication
        int[] result = new int[n * 2]; 
        
        int index = 0;
        for (int i = 0; i < n; i++) {
            result[index++] = arr[i];
            if (arr[i] == k) {
                
                // Insert an adjacent k
                result[index++] = k;
            }
        }
        
        // Resize to the actual size
        return Arrays.copyOf(result, index);
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int k = 0;
        int[] ans = duplicateK(arr, k);

        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
    }
}
