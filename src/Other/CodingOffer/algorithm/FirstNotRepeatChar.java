package Other.CodingOffer.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Heiku on 2018/7/28
 *
 * 题目：在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）
 *
 * 思路：利用map结构，存储键值对，最后遍历str，每个char作为key，查找对应的value为1的
 */
public class FirstNotRepeatChar {


    public int FirstNotRepeatingChar(String str) {


        if (str == null || str.length() == 0){
            return -1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++){

            char s = str.charAt(i);
            if (map.containsKey(s)){
                int v = map.get(s);
                v++;

                map.put(s, v);
            }else{
                map.put(s, 1);
            }
        }

        int p = 0;
        for (int i = 0; i < str.length(); i++){
            if (map.get(str.charAt(i)) == 1)
                return i;
            else
                p++;
        }

        return 0;
    }

    public static void main(String[] args) {
        new FirstNotRepeatChar().FirstNotRepeatingChar("google");
    }
}
