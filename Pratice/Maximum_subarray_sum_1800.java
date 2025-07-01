public class Maximum_subarray_sum_1800 {

    public static int maxAscendingSum(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[nums.length - 1];
        }
        int max = 0;
        int temp_max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                temp_max += nums[i];
            } else {
                max = max > temp_max ? max : temp_max;
                temp_max = nums[i];
            }
        }
        return max > temp_max ? max : temp_max;
    }

    public static void main(String[] args) {
        int[] arr = {12,17,15,13,10,11,12};
        System.out.println(maxAscendingSum(arr));
    }
}
