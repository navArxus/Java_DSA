import java.util.HashMap;

public class Majority_element_169 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }
        int max = 0;
        for (Integer i : map.keySet()) {
            if (map.get(max) == null) {
                max = i;
            } else {
                max = (map.get(max) < map.get(i))? i :max;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println("Value" + majorityElement(new int[]{3, 3, 4}));
    }
}
