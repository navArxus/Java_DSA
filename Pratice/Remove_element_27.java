public class Remove_element_27 {

    static int replaceIndex(int[] arr, int index, int val) {
        for (int i = index; i < arr.length; i++) {
            if (arr[i] != val) {
                return i;
            }
        }
        return -1;
    }

    static int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                int newindex = replaceIndex(nums, i, val);
                if (newindex != -1) {
                    int temp = nums[i];
                    nums[i] = nums[newindex];
                    nums[newindex] = temp;
                    index++;
                }
            } else {
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = { 3,2,2,3 };
        int val = 3;
        System.out.println(removeElement(nums, val));
        for (int i : nums) {
            System.out.print(i);
        }
    }
}
