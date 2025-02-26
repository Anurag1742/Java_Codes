package If_Else_Switch_Case;

public class J11LeapYear {
    public static void main(String[] args) {
        int y;
        y = 2016;
        if (y % 100 == 0){
            if (y % 400 == 0){
                System.out.println("It is LEAP YEAR.");
            }else{
                System.out.println("It is not a LEAP YEAR.");
            }
        }else if(y % 4 == 0){
            System.out.println("It is LEAP YEAR.");
        }else{
            System.out.println("It is not a LEAP YEAR.");
        }
    }
}
