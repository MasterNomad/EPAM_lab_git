/*
We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same
group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
Return the size of the largest mirror section found in the given array.

https://codingbat.com/prob/p196409
 */

package array_3;

public class maxMirror {

    public int start(final int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int result = 1;
        int tmp;

        for (int i = 0; i < nums.length - result; i++) {

            tmp = findMaxMirrorLength(nums, i);

            if (tmp > result) {
                result = tmp;
            }
        }

        return result;
    }

    private int findMaxMirrorLength(final int[] array, final int index) {

        int nextIndex = nextIndexOf(array, index);
        int max = 0;

        while (nextIndex != -1) {

            if (max < findMirrorLength(array, index, nextIndex)) {
                max = findMirrorLength(array, index, nextIndex);
            }

            nextIndex = nextIndexOf(array, nextIndex);
        }

        return max;
    }

    private int findMirrorLength(final int[] array, int startIndex, int secondIndex) {

        int result = 0;

        while (startIndex < array.length && secondIndex > -1) {

            if (array[startIndex++] == array[secondIndex--]) {
                result++;
            } else {
                return result;
            }
        }

        return result;
    }


    private int nextIndexOf(int[] array, int startIndex) {

        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[startIndex] == array[i]) {
                return i;
            }
        }

        return -1;
    }
}
