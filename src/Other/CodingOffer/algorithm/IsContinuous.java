package Other.CodingOffer.algorithm;

/**
 * Created by Heiku on 2018/8/17
 *
 * 题目：判断套牌是不是顺子
 *
 * 思路：
 */
public class IsContinuous {
    public boolean isContinuous(int [] numbers) {

        if (numbers == null || numbers.length <= 0){
            return false;
        }
        int[] d = new int[14];
        d[0] = -5;

        int len = numbers.length;
        int max = -1;
        int min = 14;

        for (int i = 0; i < len; i++){
            d[numbers[i]]++;

            if (numbers[i] == 0)
                continue;

            if (d[numbers[i]] > 1){
                return false;
            }

            if (numbers[i] > max){
                max = numbers[i];
            }
            if (numbers[i] < min){
                min = numbers[i];
            }
        }

        if (max - min < 5)
            return true;
        else
            return false;

    }
}
