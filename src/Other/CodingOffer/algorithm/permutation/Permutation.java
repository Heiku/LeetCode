package Other.CodingOffer.algorithm.permutation;

import java.util.ArrayList;
import java.util.Collections;


/**
 * 题目：输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 *      例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 *
 * 思路：回溯算法，         ABC
 *          swap(AA)    swap(AB)    swap(AC)
 *            ABC          BAC         CAB
 *
 *   swap(BB)swap(BC)| swap(AA)swap(AC)|  swap(AA) swap(AB)
 *
 */
public class Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str != null && str.length() > 0){
            PermutationHelper(str.toCharArray(), 0, list);
            Collections.sort(list);
        }
        return list;
    }


    public void PermutationHelper(char[] cs, int i, ArrayList<String> list){
        if (i == cs.length - 1){
            String val = String.valueOf(cs);
            if (!list.contains(val)){
                list.add(val);
            }
        }else {
            for (int j = i; j < cs.length; j++){
                swap(cs, i, j);
                PermutationHelper(cs, i + 1, list);
                swap(cs, i, j);
            }
        }
    }

    public void swap(char []cs, int i, int j){
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new Permutation().Permutation("abc");
        for (String s : list){
            System.out.println(s);
        }
    }
}
