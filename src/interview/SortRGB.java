package interview;

/**
 * 题目：一个字符串中包含RGB三个字符，请排序。 R前，G中，B后
 *      test:str = "GRGBRBGBBRRGBRBG"
 *
 * 思路：三游标，用i维护R，用j维护B，
 *      k负责遍历，当遇到R时，与i交换值，
 *                当遇到B时，与j交换值，
 *                 当遇到G时，k++
 */
public class SortRGB {

    public String sort(String str){

        char[] c = str.toCharArray();

        int i = 0;
        int j = c.length - 1;

        int k = 0;
        while (k <= j){

            if (c[k] == 'R'){
                char tmp = c[i];
                c[i] = c[k];
                c[k] = tmp;

                i++;
            }else if (c[k] == 'B'){
                char tmp = c[j];
                c[j] = c[k];
                c[k] = tmp;

                j--;
            }else {
                k++;
            }
        }


        StringBuilder builder = new StringBuilder();
        for (char chars : c){
            builder.append(chars);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new SortRGB().sort("GRGBRBGBBRRGBRBG"));
    }
}
