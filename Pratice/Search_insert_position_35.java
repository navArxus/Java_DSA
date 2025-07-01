public class Search_insert_position_35 {

    public static int searchInsert(int[] nums, int target) {
        int si = 0, ei = nums.length - 1;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return si;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        System.out.println(searchInsert(arr, 0));

    }
}