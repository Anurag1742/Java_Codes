package Switch;
import java.util.Set;
import java.util.HashSet;

public class J01DoubleSwitch {

    public static int J01DoubleSwitch(int n, String s) {
        char[] bulbs = s.toCharArray();
        int operations = 0;

        Set<String> visited = new HashSet<>();

        while (!allOff(bulbs)) {
            String currentState = new String(bulbs);
            if (visited.contains(currentState)) {
                return -1; // Cycle detected, not possible
            }
            visited.add(currentState);

            boolean toggled = false;

            for (int i = 0; i < n; i++) {
                int next = (i + 1) % n;
                if (bulbs[i] == '1') {
                    toggle(bulbs, i);
                    toggle(bulbs, next);
                    operations++;
                    toggled = true;
                    break;
                }
            }

            if (!toggled) return -1;
        }

        return operations;
    }

    private static boolean allOff(char[] bulbs) {
        for (char bulb : bulbs) {
            if (bulb == '1') return false;
        }
        return true;
    }

    private static void toggle(char[] bulbs, int index) {
        bulbs[index] = (bulbs[index] == '1') ? '0' : '1';
    }
}