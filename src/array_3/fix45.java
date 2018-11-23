/*
Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately
followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's,
and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.

https://codingbat.com/prob/p125819
*/

package array_3;

public class fix45 {

    public int[] start(int[] nums) {

        int index = findNext(nums, 0, 5);

        for (int i = 0; i < nums.length - 1 && index != -1; i++) {

            if (nums[i] == 4) {

                nums[index] = nums[++i];
                nums[i] = 5;

                index = findNext(nums, index, 5);
                while (index > 0 && nums[index - 1] == 4) {
                    index = findNext(nums, ++index, 5);
                }
            }
        }
        return nums;
    }

    private int findNext(final int[] array, int startIndex, int key) {

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
