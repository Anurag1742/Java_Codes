package If_Else_Switch_Case;
import java.util.Scanner;

public class J03If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        if ( n>100) {
            System.out.println("The Nummber is greater than 100.");
        }
        else {
            System.out.println( "The Number is smaller than 100.");
        }
    }
}
