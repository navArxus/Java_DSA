import java.util.HashMap;

public class Roman_to_integer_13 {

    public static int romanToInt(String s) {
        int ans = 0;
        HashMap<Character, Integer> romanToIntegerMap = new HashMap<>();
        romanToIntegerMap.put('I', 1);
        romanToIntegerMap.put('V', 5);
        romanToIntegerMap.put('X', 10);
        romanToIntegerMap.put('L', 50);
        romanToIntegerMap.put('C', 100);
        romanToIntegerMap.put('D', 500);
        romanToIntegerMap.put('M', 1000);
        for (int i = s.length() - 1; i >= 0; i--) {
            if (i == 0) {
                ans += romanToIntegerMap.get(s.charAt(i));
            } else {

                if (romanToIntegerMap.get(s.charAt(i - 1)) < romanToIntegerMap.get(s.charAt(i))) {
                    ans += romanToIntegerMap.get(s.charAt(i)) - romanToIntegerMap.get(s.charAt(i - 1));
                    i--;
                } else {
                    ans += romanToIntegerMap.get(s.charAt(i));
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "MCMXCIV";
        System.out.println(romanToInt(str));
    }
}