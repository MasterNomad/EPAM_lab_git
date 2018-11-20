/*Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear
in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays
are already in sorted order.

https://codingbat.com/prob/p134022
*/

package array_3;

public class linearIn {

    public boolean start(final int[] outer, final int[] inner){

        if (inner.length == 0) {
            return true;
        }

        int innerIndex = 0;
        int innerLength = inner.length-1;

        for (int i : outer) {

            if (i > inner[innerIndex]) {
                return false;
            }
            if (i == inner[innerIndex]) {
                innerIndex++;
            }
            if (innerIndex > innerLength) {
                return true;
            }
        }
        return false;
    }

}
