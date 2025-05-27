package GU_OOPs;
import java.util.*;

public class J20RemoveMap {
    public static void main(String[] args) {
        Map<Integer, String>map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println("Before remove: " + map);
        map.remove(2); // Remove key 2

        System.out.println("After remove : " + map);

    }    
}
