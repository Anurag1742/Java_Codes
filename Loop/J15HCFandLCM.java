package Loop;

import java.util.Scanner;

public class J15HCFandLCM {
    public static void main(String[] args) {
        int a, b, i, s, hcf = 0, lcm = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        b = sc.nextInt();

        if (a < b)
            s = a;
        else
            s = b;

        for (i = 1; i <= s; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                hcf = i;
            }
        }
        System.out.println("HCF : " + hcf);

        lcm = (a * b) / hcf;
        System.out.println("LCM : " + lcm);
    }
}
