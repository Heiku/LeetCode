package Something;

/**
 *  520
 *  题目：给定一个单词，你需要判断单词的大写使用是否正确。
 *
 *          我们定义，在以下情况时，单词的大写用法是正确的：
 *
 *          全部字母都是大写，比如"USA"。
 *          单词中所有字母都不是大写，比如"leetcode"。
 *          如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 *          否则，我们定义这个单词没有正确使用大写字母。
 *
 *
 */
public class DetectCapitalUse {
    public boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        int len = chars.length;

        int count = 0;
        for (int i = 0; i < len; i++){
            if (chars[i] >= 'A' && chars[i] <= 'Z')
                count++;
        }

        if (count == len || ((chars[0] >= 'A' && chars[0] <= 'Z') && (count == 1)) || count == 0)
            return true;
        return false;
    }
}
