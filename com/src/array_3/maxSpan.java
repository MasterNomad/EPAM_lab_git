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

        for (int i = 0; i < nums.length - result; i++) {

            result = Math.max(result, lastIndexOf(nums, i) - i + 1);

        }

        return result;
    }

    private int lastIndexOf(final int[] array, final int index) {

        for (int i = array.length - 1; i > index; i--) {
            if (array[index] == array[i]) {
                return i;
            }
        }

        return -1;
    }

}
