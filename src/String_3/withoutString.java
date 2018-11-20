/*
Given two strings, base and remove, return a version of the base string where all instances of the remove string have been
removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances,
so with "xxx" removing "xx" leaves "x".

https://codingbat.com/prob/p192570
*/

package String_3;

public class withoutString {

    public String start(final String base, final String remove) {

        String result = base;
        int length = remove.length();

        String lowerBase = base.toLowerCase();
        String lowerRemove = remove.toLowerCase();

        int index = lowerBase.indexOf(lowerRemove);

        while (index != -1) {
            result = result.substring(0, index) + result.substring(index + length);
            lowerBase = result.toLowerCase();
            index = lowerBase.indexOf(lowerRemove);
        }

        return result;
    }
}
