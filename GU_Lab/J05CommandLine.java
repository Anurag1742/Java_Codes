package GU_Lab;

public class J05CommandLine {
    public static void main(String[] args) {
        System.out.println("Number of Command-Line arguments: " + args.length);

        for(int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i+1) + ": " + args[i]);
        }
    }
}
