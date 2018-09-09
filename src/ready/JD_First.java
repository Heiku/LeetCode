package ready;

import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/9
 *
 * 求出不及格商品的数量
 */
public class JD_First {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();

            int[][] arr = new int[n][3];
            for (int i = 0; i < n; i++){
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
                arr[i][2] = sc.nextInt();
            }

            int count = 0;
            for (int i = 0; i < n; i++){
                for (int j = 1; j < n; j++){
                    if (i == j)
                        break;

                    if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1] && arr[i][2] < arr[j][2]){
                        count++;
                        break;
                    }
                }
            }
            System.out.println(count);
        }

    }
}
