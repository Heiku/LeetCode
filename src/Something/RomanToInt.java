package Something;

import java.util.ArrayList;
import java.util.List;


/**
 * 13
 *
 * 思路：判断两两判断，根据规则加或减
 */

public class RomanToInt {
    public int romanToInt(String s) {

        int []value = new int[]{1, 5, 10, 50, 100, 500, 1000};

        List<String> list = new ArrayList<>();
        list.add("I");
        list.add("V");
        list.add("X");
        list.add("L");
        list.add("C");
        list.add("D");
        list.add("M");

        int sum = 0;

        String []arr = s.split("");
        for (int i = 0; i <= arr.length - 1; i++){



            if (i == (arr.length - 1)){
                sum += value[list.indexOf(arr[i])];
            }else {
                int index = list.indexOf(arr[i]);
                int next = list.indexOf(arr[i + 1]);

                if (value[index] < value[next]){
                    int n = value[next] - value[index];
                    sum += n;
                    i += 1;
                }else {
                    sum += value[index];
                }
            }


        }

        return sum;
    }

    public static void main(String[] args) {
        RomanToInt r = new RomanToInt();
        System.out.println(r.romanToInt("IV"));
    }
}
