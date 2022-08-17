public class Sum28 {

    public static void main(String[] args) {
        /*
            Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
        */

        int[] nums1 = {2, 3, 2, 2, 4, 2}; // true
        int[] nums2 = {2, 3, 2, 2, 4, 2, 2}; // false
        int[] nums3 = {1, 2, 3, 4}; // false
        System.out.println(sum28(nums1));
        System.out.println(sum28(nums2));
        System.out.println(sum28(nums3));
    }

    public static boolean sum28(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num == 2) {
                sum += num;
            }
        }
        return sum == 8;
    }

}
