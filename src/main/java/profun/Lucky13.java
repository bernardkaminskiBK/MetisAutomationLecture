package profun;

public class Lucky13 {

    public static void main(String[] args) {

        /*
            Given an array of ints, return true if the array contains no 1's and no 3's.
        */

        int[] nums1 = {0, 2, 4}; // true
        int[] nums2 = {1, 2, 3}; // false
        int[] nums3 = {1, 2, 4}; // false
        System.out.println(lucky13(nums1));
        System.out.println(lucky13(nums2));
        System.out.println(lucky13(nums3));
    }

    public static boolean lucky13(int[] nums) {
        boolean result = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                result = false;
            }
        }
        return result;
    }
}
