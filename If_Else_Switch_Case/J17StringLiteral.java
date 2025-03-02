package If_Else_Switch_Case;
import java.util.*;

public class J17StringLiteral {
    public static void main(String[] args) {
        String dname;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Day Name = ");
        dname = sc.next();

        dname = dname.toUpperCase();

        switch(dname)
        {
            case "MONDAY":
                System.out.println("It is day number-1.");
                break;
            case "TUESDAY":
                System.out.println("It is day number-2.");
                break;
            case "WEDNESDAY":
                System.out.println("It is day number-3.");
                break;
            case "THURSDAY":
                System.out.println("It is day number-4.");
                break;
            case "FRIDAY":
                System.out.println("It is day number-5.");
                break;
            case "SATARDAY":
                System.out.println("It is day number-6.");
                break;
            case "SUNDAY":
                System.out.println("It is day number-7.");
                break;
            default:
                System.out.println("It is wrong day.");
        }
    }
}
