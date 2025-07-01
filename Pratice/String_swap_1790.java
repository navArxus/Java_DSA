import java.util.ArrayList;
import java.util.Hashtable;

public class String_swap_1790 {

    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        ArrayList<Character> keys = new ArrayList<>();
        ArrayList<Character> values = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i) ) {
                keys.add(s1.charAt(i));
                values.add(s2.charAt(i));
            }
        }
        if (keys.size() == 0 && values.size() == 0) {
            return true;
        }
        if (keys.size() == 2 && values.size() == 2) {
            if (keys.get(0) == values.get(1)  && keys.get(1) == values.get(0)) {
                return true;
            }else {
                return false;
            }
            
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(areAlmostEqual(s1, s2));
    }
}
