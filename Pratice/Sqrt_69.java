public class Sqrt_69 {
    public static int mySqrt(int x) {
        if (x < 2)
            return x;
        int low = 0, high = x;
        while (low <= high) {
            int mid = (low + high) / 2;
            long multiply = (long) mid * mid;
            if (multiply == x) {
                return mid;
            } else if (multiply > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }

    

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
}
