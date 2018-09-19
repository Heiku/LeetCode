package ready;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/18
 */
public class Tercent_Thrid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){

            int test = sc.nextInt();

            List<List<Integer>> lists = new ArrayList<>();
            for (int i = 0; i < test; i++){

                List<Integer> l = new ArrayList<>();

                int n = sc.nextInt();
                for (int j = 0; j < n; j++){
                    l.add(sc.nextInt());
                }
                lists.add(l);
            }


            int sum = 0;
            for (List<Integer> list : lists){

                Collections.sort(list);

                for (int i = 0; i < list.size(); i++){
                    for (int j = i + 1; j < list.size(); j++){

                        int len = list.get(i) + list.get(j);

                        for (int k = j+ 1; k < list.size(); k++){
                            if (list.get(k) < len)
                                sum++;
                        }
                    }
                }
            }

            System.out.println(sum);
        }
    }
}
