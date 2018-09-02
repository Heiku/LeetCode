package interview;

/**
 * Created by Heiku on 2018/8/25
 *
 * 题目：输入一个矩阵，从右上角开始按照斜对角线打印矩阵的值，如矩阵为：
 *          1, 2,  3,  4
 *          5, 6,  7,  8
 *          9, 10, 11, 12
 *          13,14, 15, 16
 *      输出：
 *          4, 3, 8, 2, 7, 12, 1, 6, 11, 16, 5, 10, 15, 9, 14, 13
 *
 *
 *  思路：分为右上和左下两部分打印，坐上打印从最右开始，一次递减，每次打印完col++，row++，判断是否越界
 */
public class DiagonalPrint {


    public void DiagonalPrint(int[][] arr, int n){
        int row = 0;
        int col = 0;

        for (int i = n - 1; i >= 0; i--){
            row = 0;
            col = i;

            while (col < n && row < n){
                System.out.println(arr[row][col]);
                row++;
                col++;
            }
        }


        for (int j = 1; j < n; j++){
            row = j;
            col = 0;

            while (col < n && row < n){
                System.out.println(arr[row][col]);
                row++;
                col++;
            }
        }

    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        new DiagonalPrint().DiagonalPrint(arr, 4);
    }
}
