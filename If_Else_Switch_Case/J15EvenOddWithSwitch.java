package If_Else_Switch_Case;

public class J15EvenOddWithSwitch {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++)
        {
            switch(i)
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                    System.out.println(i + "- Odd Number.");
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 10:
                    System.out.println(i + "- Even Number.");
                    break;
            }
        }
        System.out.println(" The End");
    }
}
