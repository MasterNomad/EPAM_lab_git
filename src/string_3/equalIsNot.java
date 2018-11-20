/*
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances
of "not" anywhere in the string (case sensitive).

https://codingbat.com/prob/p141736
 */

package string_3;

public class equalIsNot {

    public boolean start(final String str) {

        return substringCounter(str, "is") == substringCounter(str, "not");

    }

    private int substringCounter(final String str, final String search) {

        int index = str.indexOf(search);

        int result = 0;

        while (index != -1) {
            result++;
            index = str.indexOf(search, ++index);
        }

        return result;

    }

}
