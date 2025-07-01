public class Int_to_roman_12 {

    static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;// Base case: If the subarray has only one element, it is already sorted.
        }
        int mid = (si + ei) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si, j = mid + 1, k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i++];
            } else {
                temp[k] = arr[j++];
            }
            k++;
        }

        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (int k2 = 0, k3 = si; k2 < temp.length; k2++, k3++) {
            arr[k3] = temp[k2];
        }
    }

    public static void sortColors(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
