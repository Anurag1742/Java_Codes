// import java.util.*;
// public class SparseMatrix {
    // public static int sumString(String s){
    // int[] arr = new int[s.length()]
    // int sum = Character.getNumbaricValue(s.charAt('0'));

    // int max_score = 0;
    // }
    // public static int maxScore(String ){
    // for(int i=1; i<s.length; i++){
    // if(.string[i] == 0){

    // }
    // }
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // String str = sc.next();
    // System.out.println(str);
    // }
    // }

    // public class SparseMatrix {
    // public int maxScore(String s) {
    // int n = s.length();
    // int max_score = 0;

    // for (int i = 1; i < n; i++) {
    // String left = s.substring(0, i);
    // String right = s.substring(i, n);

    // int left_zeros = 0;
    // for (char c : left.toCharArray()) {
    // if (c == '0') {
    // left_zeros++;
    // }
    // }

    // int right_ones = 0;
    // for (char c : right.toCharArray()) {
    // if (c == '1') {
    // right_ones++;
    // }
    // }

    // int current_score = left_zeros + right_ones;
    // max_score = Math.max(max_score, current_score);
    // }

    // return max_score;
    // }
    // }
public class SparseMatrix 
    public static void main(String[] args) {
int max = 0;
int zero = 0;
int n= nums.size();

for(int i=0; i<n; i++){
    if(s[i] == '0'){
        zero++;
    }
    int one = 0;
    for(int j=i+1; j<n; j++){
        if(s[j] == '1'){
            one++;
        }
    }
    sum = zero + one;
    if(sum > max){
        max = sum;
    }
    }
    
return max;
}
