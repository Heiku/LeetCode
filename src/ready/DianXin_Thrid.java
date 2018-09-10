package ready;

import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/10
 */
public class DianXin_Thrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String a = sc.next();
            String b = sc.next();

            if (a.length() > b.length()){
                String temp = a;
                a = b;
                b = temp;
            }
            int m = a.length();
            int n = b.length();

            int max=0;

            int c[][] = new int[m][n];

            for (int i = 0; i < m; i++){
                for (int j = 0; j < n; j++){

                    if (i > 0 && j > 0 && a.charAt(i) == b.charAt(j)){
                        c[i][j] = c[i-1][j-1] + 1;

                        if (c[i][j] > max){
                            max = c[i][j];
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }
}
