/*
Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately
followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's,
and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.

https://codingbat.com/prob/p125819
*/

package array_3;

public class fix45 {

    public int[] start(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                nums = rearrange(nums, i++);
            }
        }

        return nums;
    }

    private int[] rearrange(int[] nums, final int index) {

        int index5 = next5(nums);

        if (index5 == -1) {
            return nums;
        }

        int tmp = nums[index + 1];
        nums[index + 1] = nums[index5];
        nums[index5] = tmp;

        return nums;
    }

    private int next5(final int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5 && (i == 0 || array[i - 1] != 4)) {
                return i;
            }
        }

        return -1;
    }


}
