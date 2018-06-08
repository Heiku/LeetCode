package Other.CodingOffer.algorithm.printMatrix;

import java.util.ArrayList;
import java.util.List;


/**
 *  题目：输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 *          例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 *          则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 *  1   2   3   4
 *  5   6   7   8
 *  9   10  11  12
 *  13  14  15  16
 *
 *  思路：定义四个角，每次循环一圈，每次循环角的值的改变，注意限定临界值
 */
public class PrintMatrix {

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        int row = matrix.length;
        int col = matrix[0].length;

        if (row == 0)
            return null;

        if (col == 0)
            return null;

        // 规定起始位置
        int startRow = 0;
        int endRow = row - 1;
        int startCol = 0;
        int endCol = col - 1;

        while (startRow <= endRow && startCol <= endCol){

            // 就剩一行
            if(startRow==endRow){
                for(int i=startCol;i<=endCol;i++)
                    list.add(matrix[startRow][i]);
                return list;
            }

            // 剩一列
            if(startCol==endCol){
                for(int i=startRow;i<=endRow;i++)
                    list.add(matrix[i][startCol]);
                return list;
            }

            // 左上 -> 右上
            for(int i=startCol;i<=endCol;i++)
                list.add(matrix[startRow][i]);

            // 右上 -> 右下
            for(int i=startRow+1;i<=endRow;i++)
                list.add(matrix[i][endCol]);

            // 右下 -> 左下
            for(int i=endCol-1;i>=startCol;i--)
                list.add(matrix[endRow][i]);

            // 左下 -> 左上
            for(int i=endRow-1;i>=startRow+1;i--)
                list.add(matrix[i][startCol]);

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return list;

    }
}
