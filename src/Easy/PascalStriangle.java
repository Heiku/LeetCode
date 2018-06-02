package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 118 杨辉三角
 * 题目：给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 *
 * 思路：每个数为上一行的正上方数 与 正上方的前一个数的和
 *
 */
public class PascalStriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < numRows + 1; i++ ){

            List<Integer> list = new ArrayList<>();


            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i){
                    list.add(1);
                } else {
                    list.add(lists.get(i - 1).get(j - 1) + lists.get(i - 1).get(j));
                }
            }
            lists.add(list);
        }

        return lists;
    }

    public static void main(String[] args) {
        PascalStriangle pascal = new PascalStriangle();
        pascal.generate(5);
    }
}
