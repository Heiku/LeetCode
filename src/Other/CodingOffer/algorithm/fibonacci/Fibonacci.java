package Other.CodingOffer.algorithm.fibonacci;

public class Fibonacci {

    // 1 1 2 3 5 8 13 21
    public int Fibonacci(int n) {

        if (n <= 0)
            return 0;
        if (n <= 2)
            return 1;

        int pre1 = 1;
        int pre2 = 1;
        int result = 0;
        for (int i = 2; i < n; i++){
            result = pre1 + pre2;

            pre1 = pre2;
            pre2 = result;

        }

        return result;
    }
}
