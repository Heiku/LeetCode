package ready;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/9
 *
 * 最长子字符串
 */
public class ByteDance_First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.nextLine();

            if (str.length() <= 0){
                System.out.println(0);
                return;
            }

            int max = 0;
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0, j = 0; i <str.length(); i++){
                if (map.containsKey(str.charAt(i))){
                    j = Math.max(j, map.get(str.charAt(i)) + 1);
                }

                map.put(str.charAt(i), i);

                max = Math.max(max, i - j + 1);
            }

            System.out.println(max);
        }
    }
}
