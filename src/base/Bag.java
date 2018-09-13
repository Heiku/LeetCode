package base;

/**
 * Created by Heiku on 2018/9/12
 *
 * 01背包
 */
public class Bag {
    public static int getMaxValue(int[] weight, int[] value, int w){

        int n = weight.length;
        int[][] table = new int[n + 1][w + 1];

        for (int i = 1; i <= n; i++){
            for (int j = 0; j <= w; j++){
                if (weight[i - 1] > j)      // 超重，不放入，当前总价值为前一个
                    table[i][j] = table[i - 1][j];
                else                // 不超，max（上一个价值， 不放入当前之前的值 + 当前的价值 ）
                    table[i][j] = Math.max(table[i - 1][j], table[i - 1][j - weight[i - 1]] + value[i - 1]);
            }
        }

        return table[n][w];
    }



    // 空间优化O(m)
    public static int getMaxValueBetter(int[] weight, int[] value, int w){
        int n = weight.length;
        int[] table = new int[w + 1];


        for (int i = 1; i <= n; i++){
            for (int j = w; j >=0; j--){
                if (weight[i - 1] <= j){
                    table[j] = Math.max(table[j], table[j - weight[i - 1]] + value[i - 1]);
                }
            }
        }

        return table[w];
    }
}
