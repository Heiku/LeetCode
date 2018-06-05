package interview;


/**
 * 两个字符串的最大公共子串
 *
 * 思路：使用一个二维数组，当字符相同时，记录下对应的i，j，在数组中构建出对角线，max为对角线右下角
 */
public class MaxComSubStr {

    private int maxComSubStr(String a, String b){

        if (a.length() > b.length()){
            String temp = a;
            a = b;
            b = temp;
        }
        int m = a.length();
        int n = b.length();

        int loc_x = 0,loc_y = 0;
        int max=0;

        int c[][] = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){

                if (i > 0 && j > 0 && a.charAt(i) == b.charAt(j)){
                    c[i][j] = c[i-1][j-1] + 1;

                    if (c[i][j] > max){
                        max = c[i][j];
                        loc_x = i;
                        loc_y = j;
                    }
                }
            }
        }
        System.out.println("loc_x = " + loc_x + "  loc_y = " + loc_y );
        return max;
    }

    public static void main(String[] args) {
        String a = "acbac", b = "acaccbabb";
        System.out.println(new MaxComSubStr().maxComSubStr(a,b));
        System.out.println(b.substring(4,7));
    }
}
