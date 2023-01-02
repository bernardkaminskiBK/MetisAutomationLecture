package metis.academy.profun;

public class Only14 {

    public static void main(String[] args) {
        /*
            Given an array of ints, return true if every element is a 1 or a 4.
        */

        int[] nums1 = {1, 4, 1, 4}; // true
        int[] nums2 = {1, 4, 2, 4}; // false
        int[] nums3 = {1, 1}; // true
        System.out.println(only24(nums1));
        System.out.println(only24(nums2));
        System.out.println(only24(nums3));
    }

    public static boolean only24(int[] nums) {
        boolean result = true;
        for (int num : nums) {
            if (num == 1 || num == 4) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

}
