package Loop;

public class J16Advancedloop {
    public static void main(String[] args) {
        String s1 = "INDIA";
        char s2[] = new char[s1.length()];

        for (int i = 0; i < s1.length(); i++) {
            s2[i] = s1.charAt(i);
        }
        for (char e : s2) {
            System.out.print(e);
        }
    }
}
