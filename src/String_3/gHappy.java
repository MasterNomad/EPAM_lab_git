/*
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return
true if all the g's in the given string are happy.

https://codingbat.com/prob/p198664
 */

package String_3;

public class gHappy {

    public boolean start(final String str) {

        if (str.equals("g")) {
            return false;
        }

        int index = str.indexOf('g');

        while (index != -1) {

            if (index == 0 && str.charAt(index + 1) != 'g') {
                return false;
            }
            if (index == str.length()-1 && str.charAt(index - 1) != 'g') {
                return false;
            }
            if (str.charAt(index - 1) != 'g' && str.charAt(index + 1) != 'g') {
                return false;
            }

            index = str.indexOf(str.charAt(index), ++index);
        }

        return true;

    }
}
