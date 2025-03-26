public class StepByStepSum {
    public static int minStartValue(int arr[]){
        int minValue = Integer.MAX_VALUE;
        int num = 0;
        for(int i = 0;i<arr.length;i++){
            num = num +arr[i];
            if(num<minValue){
                minValue  = num;
            }
        }
        return (int) Math.abs(minValue)+1;
    }
    public static void main(String[] args) {
        int arr[] = {-3, 2, -3, 4, 2};
        int value = minStartValue(arr);
        System.out.println(value);
    }
}
