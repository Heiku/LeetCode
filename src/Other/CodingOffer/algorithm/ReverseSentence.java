package Other.CodingOffer.algorithm;

/**
 * Created by Heiku on 2018/8/17
 *
 * 题目：牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 *      同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。
 *      后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
 *      Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 *
 * 思路：字符串数组交换
 */
public class ReverseSentence {
    public String ReverseSentence(String str) {

        // 先取出多余空格再判断
        if(str.trim().equals("")){
            return str;
        }


        String[] strings = str.split(" ");

        int i = 0;
        int j = strings.length - 1;
        while (i < j){
            exch(strings, i, j);

            i++;
            j--;
        }

        StringBuilder sb = new StringBuilder();
        for (String s : strings){
            sb.append(" ").append(s);
        }

        return sb.toString().trim();
    }


    void exch(String[] c, int i, int j){
        String tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;
    }
}
