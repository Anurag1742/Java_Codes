package GU_OOPs;
import java.util.*;

public class J19Map {
    public static void main(String[] args) {
        Map<Integer, String>map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(1, "Uno");

        System.out.println(map);

    }    
}
