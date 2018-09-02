package Something;

import java.util.HashMap;
import java.util.Map;

/**
 * 290. Word Pattern
 *
 * Given a pattern and a string str, find if str follows the same pattern.
 *
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 *      Input: pattern = "abba", str = "dog cat cat dog"
 *      Output: true
 *
 *      Input:pattern = "abba", str = "dog cat cat fish"
 *      Output: false
 *
 * 思路：利用hashmap的特点，通过先判断key，再判断value
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {

        // [dog, cat, cat, dog]
        String[] words = str.split(" ");

        if (pattern.length() != words.length)
            return false;

        Map map = new HashMap();
        for (int i = 0; i < words.length; i++){
            char a = pattern.charAt(i);

            if (!map.containsKey(a)){
                if (!map.containsValue(words[i])){
                    map.put(a, words[i]);
                }else {
                    return false;
                }
            }else {
                if (!map.get(a).equals(words[i]))
                    return false;
            }
        }

        return true;
    }
}
