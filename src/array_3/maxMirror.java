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
        int nextIndex;

        for (int i = 0; i < nums.length - result; i++) {

            nextIndex = nextIndexOf(nums, i);

            while (nextIndex != -1) {
                result = Math.max(result, findMirrorLength(nums, i, nextIndex));
                nextIndex = nextIndexOf(nums, nextIndex);
            }
        }

        return result;
    }

    private int findMirrorLength(final int[] array, int firstIndex, int secondIndex) {

        int result = 0;

        while (firstIndex < array.length && secondIndex > -1) {

            if (array[firstIndex++] == array[secondIndex--]) {
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
