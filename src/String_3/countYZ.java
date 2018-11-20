/*
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but
not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

https://codingbat.com/prob/p199171
*/

package String_3;

public class countYZ {

    public int start(String str) {

        int result = 0;
        char[] search = {'y', 'z'};

        for (char letter : search) {
            result += countLetter(str, letter);
        }

        return result;
    }

    private int countLetter(String str, char letter) {

        int result = 0;
        str = str.toLowerCase();
        int index = str.indexOf(letter);

        while (index >= 0) {
            if (index == str.length() - 1 || !Character.isLetter(str.charAt(index + 1))) {
                result++;
            }
            index = str.indexOf(letter, index + 1);
        }

        return result;
    }

}
