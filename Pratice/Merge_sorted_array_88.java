public class Merge_sorted_array_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        // pointers
        int nums1idx = 0, nums2idx = 0, index = 0;
        int[] temp = new int[nums1.length];
        while (m > nums1idx && n > nums2idx) {
            if (nums1[nums1idx] <= nums2[nums2idx] && m > nums1idx) {
                temp[index] = nums1[nums1idx];
                nums1idx++;
            } else {
                temp[index] = nums2[nums2idx];
                nums2idx++;
            }
            index++;
        }
        // nums 1 remaning part
        while (m > nums1idx) {
            temp[index] = nums1[nums1idx];
            nums1idx++;
            index++;
        }
        while (n > nums2idx) {
            temp[index] = nums2[nums2idx];
            nums2idx++;
            index++;
        }
        for (int i = 0; i < temp.length; i++) {
            nums1[i] = temp[i];
        }

    }

    public static void main(String[] args) {
        int[] nums1 = { 2,0 };
        int[] nums2 = { 1 };
        merge(nums1, 1, nums2, 1);
        for (int i : nums1) {
            System.out.print(" " + i);
        }
    }
}
