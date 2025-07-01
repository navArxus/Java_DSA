public class Specialarray_3151 {

    public static boolean isArraySpecial(int[] nums) {
        if (nums.length == 1)
            return true;

        for (int i = 0; i < nums.length - 1; i++) {
            boolean firstParity = (nums[i] % 2 == 0) ? true : false;
            boolean secParity = (nums[i + 1] % 2 == 0) ? true : false;

            if (firstParity && secParity) {
                return false;
            }
            if (!firstParity && !secParity) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,1,6};
        System.out.println(isArraySpecial(nums));
    }
}