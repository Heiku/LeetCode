package Other.CodingOffer.algorithm.power;

/**
 * 题目：给定一个double类型的浮点数base和int类型的整数exponent。
 *        求base的exponent次方。
 *
 * 思路：全面考虑
 */
public class Power {
    public double Power(double base, int exponent) {
        if (base == 0)
            return 0;

        if (exponent == 0)
            return 1;

        if (exponent == 1)
            return base;

        if (exponent < 0){
            double result = base;
            exponent = -exponent;
            while (exponent >= 2){
                result *= base;
                exponent--;
            }

            return 1/ result;
        }

        double result = base;
        while (exponent >= 2){
            result *= base;
            exponent--;
        }
        return result;
    }
}
