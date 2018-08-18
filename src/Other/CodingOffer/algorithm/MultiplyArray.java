package Other.CodingOffer.algorithm;

/**
 * Created by Heiku on 2018/8/18
 *
 * 题目：给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 *      其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 *
 * 思路：将整个过程分成两部分，
 *      B[0]    1,A[1],A[2],...A[n-2],A[n-1]
 *      B[1]    A[0],1,A[2].........
 *      ...
 *
 *
 *      这样形成一条以1为对角线，将整个过程分为上下两个三角型，
 *                          下面的三角形记录下1，之前的值
 *                           上面的三角性记录下1之后的值，
 *                           最后排序合并
 */
public class MultiplyArray {

    public int[] multiply(int[] A) {
        int len = A.length;
        int[] B = new int[len];

        if (len != 0){

            // 计算左下三角值
            B[0] = 1;
            for (int i = 1; i < len; i++){
                B[i] = B[i - 1] * A[i - 1];
            }

            // 计算右上三角值
            int tmp = 1;
            for (int i = len - 2; i >= 0; i--){
                tmp *= A[i + 1];
                B[i] *= tmp;
            }
        }
        return B;
    }
}
