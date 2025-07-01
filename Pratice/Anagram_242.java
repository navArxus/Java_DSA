import java.util.HashMap;

public class Anagram_242 {
    public static void main(String[] args) {
        String str = "hello world";
        for(int i =0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        HashMap<Character,Integer> map = new HashMap<>();
        int sum = 0;
        long count = map.values().stream().filter(x -> x != 0).count();
    }
}
