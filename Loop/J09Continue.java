package Loop;

public class J09Continue {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if (i%2==0){
                continue;  //if condition satisfied than here loop skip below part
            }
            System.out.println(i);
        }
    }
}
