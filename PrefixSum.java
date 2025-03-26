public class PrefixSum {
    public static int[] prefixSum(int arr[]){
        for(int i = 1; i< arr.length;i++){
            arr[i] = arr[i-1] + arr[i];
        } 
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1 ,2 ,3 ,4 };
        int result[] = prefixSum(arr);
        for(int x : result) {
            System.out.print(x + " ");
        }
    }
}
