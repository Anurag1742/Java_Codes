package Loop;

public class J02SumofNumber {
    public static void main(String[] args) {
        int s=0, len;
        len = args.length;

        for(int i = 0; i<len; i++)
        {
            int x = Integer.parseInt(args[i]);
            s = s + x;
        }
        System.out.println("Sum of Command-Line Arguments ::: "+ s);
    }
}

// Input:- java .\J02SumofNumber.java 1 2 3 4 5 6 7 8 9   
// Output:- Sum of Command-Line Arguments ::: 45