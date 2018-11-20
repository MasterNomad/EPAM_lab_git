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
        char[] search = {'y', 'z'};

        for (char letter : search) {
            result += countLetter(str, letter);
        }

        return result;
    }

    private int countLetter(final String str, final char letter) {

        int result = 0;
        String lowerStr = str.toLowerCase();
        int index = lowerStr.indexOf(letter);

        while (index != -1) {
            if (index == lowerStr.length() - 1 || !Character.isLetter(lowerStr.charAt(index + 1))) {
                result++;
            }
            index = lowerStr.indexOf(letter, index + 1);
        }

        return result;
    }

}