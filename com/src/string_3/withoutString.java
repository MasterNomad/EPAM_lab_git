/*
Given two strings, base and remove, return a version of the base string where all instances of the remove string have been
removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances,
so with "xxx" removing "xx" leaves "x".

https://codingbat.com/prob/p192570
*/

package string_3;

public class withoutString {

    public String start(final String base, final String remove) {

        StringBuilder regex = new StringBuilder();

        for (int i = 0; i< remove.length(); i++){
           regex.append("[").append((remove.toLowerCase().charAt(i))).append(remove.toUpperCase().charAt(i)).append("]");
        }

        return base.replaceAll(regex.toString(), "");

    }
}
