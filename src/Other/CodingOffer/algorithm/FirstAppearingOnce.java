package Other.CodingOffer.algorithm;

/**
 * Created by Heiku on 2018/8/18
 *
 * 题目：请实现一个函数用来找出字符流中第一个只出现一次的字符。
 *      例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，
 *      第一个只出现一次的字符是"l"。
 *
 * 思路：用额外数组空间存储状态，数组的下标为字符的ascii值，最后只要查找对应数组小标为1的字符
 */
public class FirstAppearingOnce {

    int[] table = new int[256];
    StringBuilder sb = new StringBuilder();

    //Insert one char from stringstream
    public void Insert(char ch)
    {
        sb.append(ch);
        table[ch]++;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char[] chars = sb.toString().toCharArray();
        for (char c : chars){
            if (table[c] == 1)
                return c;
        }

        return '#';
    }
}
