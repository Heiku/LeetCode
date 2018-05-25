package interview;

/**
 * 题目：给一个int数组，求平均数，返回值为int型。数组长度可能会很长，累加过程中可能会超出int范围，
 *
 * 思路：每次都判断余数的值相加是否大于
 */
public class GetAverage {

    public int getAverage(int []array){

        int N = array.length;
        int x = 0;
        int y = 0;

        for (int i = 0; i < N; i++){

            x = array[i] / N;
            int b = array[i] % N;

            if (y > N - b){
                x++;
                y -= N - b;
            }else
                y += b;

        }
        return x;
    }

    public static void main(String[] args) {
        int []arr = {3,4,5,6,7};
        GetAverage g = new GetAverage();
        g.getAverage(arr);
    }
}
