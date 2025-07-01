
public class Max_diffrence_2016 {
    public static int maximumDifference(int[] nums) {
        int max_diffrence = -1;
        for(int i = 0; i < nums.length  ; i++){
            for (int j = i+1; j < nums.length ; j++ ){
                int res = nums[j] - nums[i];
                if (res != 0 ){
                    max_diffrence = Math.max(res, max_diffrence);
                }

            }
        }
        return max_diffrence;
    }
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(maximumDifference(new int[]{1,5,2,10}));

    }
}
