package If_Else_Switch_Case;
import java.util.*;

public class J04MaxInTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int a, b;
        System.out.print("Enter First Number : ");
        a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        b = sc.nextInt();

        if (a>b) {
            System.out.println("\nFirst Number is Greater Than Second Number.");
        }else {
            System.out.println("\nFirst Number is Less or Equal to Second Number.");
        }
    }
}
