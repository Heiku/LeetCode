package Something;

import java.util.ArrayList;
import java.util.List;

/**
 * 解题思路：
 * 循环每个数字，再将每个数字拆分成数组，通过树对数组元素取余
 */
public class SelfDivingNumber {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();
        for (; left <= right ; left++){

            String s = String.valueOf(left);
            char []chars = s.toCharArray();

            int choose = 0;
            for (char c : chars){
                if (c == '0'){
                    choose = 1;
                    break;
                }
                else {
                    int d = Character.getNumericValue(c);
                    if (left % d == 0){
                        choose = 2;
                    }else {
                        choose = 1;
                        break;
                    }
                }
            }

            if (choose == 2){
                list.add(left);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        SelfDivingNumber s = new SelfDivingNumber();
        System.out.println(s.selfDividingNumbers(21,22));
    }
}
