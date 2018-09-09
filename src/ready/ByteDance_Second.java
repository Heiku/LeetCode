package ready;

import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/9
 *
 *
 * 岛屿个数
 */
public class ByteDance_Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();

            int[][] team = new int[n][n];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    team[i][j] = sc.nextInt();
                }
            }


            if (team == null || team.length == 0 || team[0].length == 0){
                System.out.println(0);
                return;
            }

            int row = team.length;
            int col = team[0].length;
            int count = 0;

            for (int i = 0; i < row; i++){
                for (int j = 0; j < col; j++){
                    if (team[i][j] == 1){
                        count++;
                        search(team, i, j, row, col);
                    }

                }
            }

            System.out.println(count++);
        }
    }

    private static void search(int[][] team, int i, int j, int row, int col) {

        if (i < 0 || i >= row || j < 0 || j >= col)
            return;

        if (team[i][j] != 1)
            return;

        team[i][j] = 0;
        search(team, i - 1, j, row, col);
        search(team, i + 1, j, row, col);
        search(team, i, j -1, row, col);
        search(team, i, j + 1, row, col);
    }
}
