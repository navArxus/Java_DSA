import java.util.ArrayList;

public class Longest_inc_dec_subarray_3105 {

    public static int longestMonotonicSubarray(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        ArrayList<Integer> inc = new ArrayList<>();
        ArrayList<Integer> dec = new ArrayList<>();
        int max = 0;
        inc.add(nums[0]);
        // For increasing
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                inc.add(nums[i]);
            } else {
                max = inc.size() > max ? inc.size() : max;
                inc.clear();
                inc.add(nums[i]);
            }
            if (nums[i - 1] > nums[i]) {
                dec.add(nums[i]);
            } else {
                max = dec.size() > max ? dec.size() : max;
                dec.clear();
                dec.add(nums[i]);
            }
        }
        // For dec
        dec.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            
        }
        if (max > inc.size() && max > dec.size()) {
            return max;
        } else if (inc.size() > max && inc.size() >= dec.size()) {
            return inc.size();
        } else {
            return dec.size();
        }

    }

    public static void main(String[] args) {
        int[] arr = { 2,1,10 };
        System.out.println(longestMonotonicSubarray(arr));
    }
}