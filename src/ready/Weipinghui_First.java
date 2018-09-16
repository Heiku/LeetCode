package ready;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/15
 */
public class Weipinghui_First {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){

            int k = sc.nextInt();
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    list.add(sc.nextInt());
                }
            }


            Collections.sort(list);

            System.out.println(list.get(k));
        }
    }
}
