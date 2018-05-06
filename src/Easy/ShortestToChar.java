package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 821
 *
 * 解题思路：将所有等于C的字符的数组索引存入list，再遍历数组将数组中的每个数与list下标的数值对比，得到最小的索引差
 */
public class ShortestToChar {
    public int[] shortestToChar(String S, char C) {


        List<Integer> list = new ArrayList<>();
        char[] arr = S.toCharArray();

        int re[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == C)
                list.add(i);
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != C) {
                int m = arr.length;

                for (int j = 0; j < list.size(); j++) {
                    m = m < Math.abs(i - list.get(j)) ? m : Math.abs(i - list.get(j)) ;
                }

                re[i] = m;
            }
        }

        return re;
    }

    public static void main(String[] args) {
        String str = new String("loveleetcode");
        ShortestToChar s = new ShortestToChar();
        s.shortestToChar(str, 'e');
    }
}
