package interview;

/**
 * Created by Heiku on 2018/8/21
 *
 * 题目：寻找两个字符串的最长子序列 blog（cnblogs,belong）
 */
public class LCS {
    public int lcs(String str1, String str2){

        int len1 = str1.length();
        int len2 = str2.length();

        int c[][] = new int[len1+1][len2+1];

        for (int i = 0; i < len1; i++){
            for (int j = 0; j < len2; j++){

                if (i == 0 || j == 0){
                    c[i][j] = 0;
                }else if (str1.charAt(i - 1) == str2.charAt(i - 1)){
                    c[i][j] = c[i-1][j-1] + 1;
                }else {
                    c[i][j] = Math.max(c[i - 1][j], c[i][j - 1]);
                }
            }
        }

        return c[len1][len2];
    }
}
