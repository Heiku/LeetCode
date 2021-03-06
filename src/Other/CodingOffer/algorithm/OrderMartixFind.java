package Other.CodingOffer.algorithm;


/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 *  思路：每次判断二维数组的右上角是否符合条件
 *      当大于时，col--，从该列的左数组寻找
 *      当小于时，row++，从该行的下数组寻找
 */
public class OrderMartixFind {

    public static boolean find(int [][]martix, int rows, int cols, int num){

        boolean isFind = false;

        if (martix != null && rows > 0 && cols > 0){

            int row = 0;
            int col = cols - 1;

            while (row < rows && col >= 0){

                if (martix[row][col] == num){
                    isFind = true;
                    break;
                }else if (martix[row][col] > num){
                    col--;
                }else {
                    row++;
                }

            }
        }

        return isFind;
    }
}
