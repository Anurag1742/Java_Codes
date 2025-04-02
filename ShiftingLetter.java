public class ShiftingLetter {
    public static String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        int[] totalShifts = new int[n];
        
        // Compute cumulative shifts from right to left
        totalShifts[n - 1] = shifts[n - 1] % 26;
        for (int i = n - 2; i >= 0; i--) {
            totalShifts[i] = (shifts[i] + totalShifts[i + 1]) % 26;
        }
        
        // Apply shifts to characters
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char newChar = (char) (((s.charAt(i) - 'a' + totalShifts[i]) % 26) + 'a');
            result.append(newChar);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "abc";
        int[] shifts1 = {3, 5, 9};
        System.out.println(shiftingLetters(s1, shifts1));  // Output: "rpl"

        // String s2 = "aaa";
        // int[] shifts2 = {1, 2, 3};
        // System.out.println(shiftingLetters(s2, shifts2));  // Output: "gfd"
    }
}
