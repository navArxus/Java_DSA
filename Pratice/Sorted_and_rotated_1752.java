public class Sorted_and_rotated_1752 {

    public static boolean check(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return true;
        }

        int pivotPoint = nums.length - 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                pivotPoint = i;
                break;
            }
        }
        if (pivotPoint == nums.length - 1) {
            return true;
        }

        int lp = (pivotPoint + 1) % (nums.length );
        int rp = (pivotPoint + 2) % (nums.length );
        while (lp != pivotPoint) {
            if (nums[lp] > nums[rp]) {
                return false;
            }

            lp = (lp + 1) % (nums.length );
            rp = (rp + 1) % (nums.length );
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 3,4,5,1,2};
        System.out.println(check(arr));
    }
}
