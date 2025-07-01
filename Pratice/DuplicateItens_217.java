import java.util.HashMap;

public class DuplicateItens_217 {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                return false;
            }
            map.put(i,1);
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
