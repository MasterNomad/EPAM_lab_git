/*
Consider the leftmost and rightmost appearances of some value in an array. We'll say that the "span" is the number of elements
between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array.
(Efficiency is not a priority.)

https://codingbat.com/prob/p189576
 */

package array_3;

public class maxSpan {

    public int start(final int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int result = 1;
        int lastIndex;

        for (int i = 0; i < nums.length - result; i++) {

            lastIndex = lastIndexOf(nums, nums[i], i + 1);

            if (lastIndex - i + 1 > result) {
                result = lastIndex - i + 1;
            }
        }

        return result;

    }

    private int lastIndexOf(final int[] array, final int key, final int endIndex) {

        for (int i = array.length - 1; i >= endIndex; i--) {
            if (key == array[i]) {
                return i;
            }
        }

        return -1;
    }


}
