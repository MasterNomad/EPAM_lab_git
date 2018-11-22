/*
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but
not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

https://codingbat.com/prob/p199171
*/

package string_3;

public class countYZ {

    public int start(final String str) {

        int result = 0;
        String search = "yz";

        for (int i = 0; i < str.length(); i++) {
            if (search.indexOf(str.toLowerCase().charAt(i)) != -1 && (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1)))) {
                result++;
            }
        }

        return result;
    }

}
