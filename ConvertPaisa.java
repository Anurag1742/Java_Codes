public class ConvertPaisa {
    public static void main(String[] args) {
        double n = 56.50;
        int rupees = (int) n;
        double p = (n-rupees)*100;
        System.out.println("Rs : "+rupees);
        System.out.println("Paisa : "+(int)p);
    }
}
