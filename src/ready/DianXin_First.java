package ready;

import java.util.*;

/**
 * Created by Heiku on 2018/9/10
 *
 * 删除出现次数最少的字符串
 */
public class DianXin_First {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.nextLine();

            char[] c = str.toCharArray();
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c1 : c){
                if (!map.containsKey(c1)){
                    map.put(c1, 1);
                }else {

                    map.put(c1, map.get(c1)+1);
                }
            }

            StringBuilder sb = new StringBuilder();
            Collection<Integer> value = map.values();
            int min = Collections.min(value);
            for (char c1 : c){
                if (map.get(c1) != min){
                    sb.append(c1);
                }
            }

            /*int max = Integer.MAX_VALUE;
            List<Character> list = new ArrayList<>();
            for (int i = 0; i < c.length; i++){
                if (map.get(c[i]) < max){
                    max = map.get(c[i]);
                    list.clear();
                    list.add(c[i]);
                }else if (map.get(c[i]) == max){
                    list.add(c[i]);
                }
            }


            for (char c1 : list){
                str = str.replace(String.valueOf(c1), "");
            }

            str.trim();*/

            System.out.println(sb.toString());
        }
    }
}
