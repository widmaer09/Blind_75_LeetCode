public class ProductofArrayExceptSelf {
    /*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
    You must write an algorithm that runs in O(n) time and without using the division operation.*/
    public static int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int prefix = 1;
        int postfix = 1;

        for (int i = 0; i < nums.length; i++) {


            if (i == 0) {
                result[i] = prefix;
            } else {
                prefix = prefix * nums[i - 1];
                result[i] = prefix;
            }

        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                result[i] = postfix * result[i];
            } else {
                result[i] = postfix * result[i];
            }
            postfix = postfix * nums[i];

        }

        return result;
    }


    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        int nums2[] = productExceptSelf(nums);
        for (int i = 0; i < nums2.length; i++) {

            System.out.println(nums2[i]);

        }


    }
}
