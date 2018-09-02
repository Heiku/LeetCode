package Something;

/**
 * Created by Heiku on 2018/9/2
 *
 *
 * 题目：
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * Example:
 *
 * Input: "Hello World"
 * Output: 5
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.trim().equals(""))
            return 0;

        String[] strs = s.split(" ");
        return strs[strs.length - 1].length();
    }
}
