public class Remove_duplicate_sorted_array_26 {

    static int replaceIndex(int[] arr, int index) {
        for (int i = index; i < arr.length; i++) {
            if ((arr[index] != arr[i]) && arr[index] < arr[i]) {
                return i;
            }
        }
        return -1;
    }

    static int removeDuplicates(int[] nums) {
        int sortedTill = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            if (nums[i] == nums[j] && nums[sortedTill] < nums[i]) {
                int newindex = replaceIndex(nums, j);
                if (newindex != -1) {
                    int temp = nums[newindex];
                    nums[newindex] = nums[j];
                    nums[j] = temp;
                    sortedTill++;
                }
            } else {
                if (nums[sortedTill] < nums[j]) {
                    int temp = nums[sortedTill + 1];
                    nums[sortedTill + 1] = nums[j];
                    nums[j] = temp;
                    sortedTill++;
                }
            }

        }
        return sortedTill + 1;
    }

    public int removeDuplicatestwo(int[] nums) {
        if (nums.length == 0)
            return 0;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i])
                nums[++index] = nums[i];

        }
        return index + 1;
    }

    public static int removeduplicatemyadvanceversion(int[] nums) {
        if (nums.length == 0)
            return 0;
        int sortedTill = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[sortedTill] != nums[i]) {
                nums[++sortedTill] = nums[i];
            }
        }
        return sortedTill + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(arr));
        for (int i : arr) {
            System.out.print(i);
        }

    }
}