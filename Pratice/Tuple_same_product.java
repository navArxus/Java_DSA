import java.util.Hashtable;

public class Tuple_same_product {

    public static int tupleSameProduct(int[] nums) {

        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (table.containsKey(nums[i] * nums[j])) {
                    Integer value = table.get(nums[i] * nums[j]);
                    table.put(nums[i] * nums[j], ++value);
                } else {
                    table.put(nums[i] * nums[j], 1);
                }
            }
        }
        int ans = 0;
        for (int key : table.keySet()) {
            Integer count = table.get(key);
            if (count >= 2) {
                int comb = (count * count - 1) / 2;
                ans += comb * 8;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(tupleSameProduct(nums));
    }
}
