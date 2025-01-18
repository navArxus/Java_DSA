public class First_and_last_position_sorted_array_34 {

    static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return new int[] { -1, -1 };
        int[] result = new int[] { -1, -1 };

        int si = 0;
        int ei = nums.length - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (nums[mid] == target) {
                result = new int[] { mid, mid };
                break;
            } else if (nums[mid] > target) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }

        }
        if (result[0] != 0) {
            while (result[0] >= 0 && nums[result[0] - 1] == target) {
                result[0]--;
                if (result[0] == 0) {
                    break;
                }
            }
        }
        if (result[1] != nums.length - 1) {
            while (result[1] <= nums.length && nums[result[1] + 1] == target) {
                result[1]++;
                if (result[1] == nums.length - 1) {
                    break;
                }

            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int[] result = new int[2];
        result = searchRange(arr, 1);
        for (int i : result) {
            System.out.print(i);
        }

    }
}