public class Search_in_sorted_array_33 {

    public static int search(int[] nums, int target) {
        int si = 0, ei = nums.length - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // left sorted
            if (nums[si] <= nums[mid]) {
                if (nums[si] <= target && target < nums[mid]) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }
            }
            // right sorted
            else {
                if (nums[mid] < target && target <= nums[ei]) {
                    si = mid + 1;
                } else {
                     ei = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 3,1 };
        System.out.println(search(nums, 1));
    }
}