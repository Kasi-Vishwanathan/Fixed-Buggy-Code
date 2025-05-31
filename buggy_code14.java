
public class buggy_code14 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int result = findMax(nums);
        System.out.println("Max value: " + result);
    }

    public static int findMax(int nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
