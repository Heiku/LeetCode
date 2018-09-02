package Something;

import java.util.ArrayList;
import java.util.List;


/**
 * 解题思路：
 * 将句子分为单词数组，再将单词分为字母数组，反转字母数组，再拼接。
 */
public class ReverseWords {
    public String reverseWords(String s) {

        List<String> list = new ArrayList<>();

        String []all_arr = s.split(" ");
        for (String arr : all_arr){
            String []a = arr.split("");

            int j = a.length -1;
            for (int i = 0; i < a.length; i++){
                if (i == j | i > j){
                    break;
                }else {
                    String tmp = "";
                    tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                    j--;
                }
            }

            String newString  = new String();
            for (String n : a){
                newString += n;
            }
            newString.trim();
            list.add(newString);
        }

        String re = new String();
        for (String n : list){
            re += " " + n;
        }


        return re.trim();
    }

    public static void main(String[] args) {
        ReverseWords re = new ReverseWords();
        System.out.println(re.reverseWords("Let's take LeetCode contest"));
    }
}
