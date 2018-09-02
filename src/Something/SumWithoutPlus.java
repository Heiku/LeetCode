package Something;

/**
 * 题目：不用加减号运算符，得到两个数的和
 * 思路：通过位运算符。用异运算构造两个数的和（不包含进位），用与运算再左移构造两者和的进位数，通过递归直到不进位。
 *
 * 减法：加上另一个数的补码（取反加一）
 *
 * 乘法：先判断两个数是否是正数，取绝对值进行多次加法
 *      或 采用手动乘积的过程，判断乘数的末位，若为1，则相加被乘数。同时，在每次运算的时候，被乘数左移，乘数右移
 *
 *
 * 除法：除数不停减去被除数，直到被除数小于除数，期间减去的次数就是商，剩下的就是余数。
 *
 */
public class SumWithoutPlus {
    public int getSum(int a, int b) {
        if (b == 0){
            return a;
        }

        int sum = a ^ b;
        int carry = (a & b) << 1;

        return getSum(sum, carry);
    }

    int substract(int num1, int num2){
        int subtractor = getSum(~num2, 1);// 先求减数的补码（取反加一）
        int result = getSum(num1, subtractor); // getSum()即上述加法运算　　
        return result ;
    }


    int multiply(int a, int b) {
        int multiplicand = a < 0 ? getSum(~a, 1) : a;
        int multiplier = b < 0 ? getSum(~b , 1) : b;


        //计算绝对值的乘积　　
        int product = 0;
        while(multiplier > 0) {
            if((multiplier & 0x1) > 0) {// 每次考察乘数的最后一位　　　　
                product = getSum(product, multiplicand);
            }
            multiplicand = multiplicand << 1;// 每运算一次，被乘数要左移一位　　　　
            multiplier = multiplier >> 1;// 每运算一次，乘数要右移一位（可对照上图理解）　　
        }
        //计算乘积的符号　　
        if((a ^ b) < 0) {
            product = getSum(~product, 1);
        }
        return product;
    }


    int divide(int a, int b){
        // 先取被除数和除数的绝对值    
        int dividend = a > 0 ? a : getSum(~a, 1);
        int divisor = b > 0 ? a : getSum(~b, 1);

        int quotient = 0;// 商    
        int remainder = 0;// 余数    
        // 不断用除数去减被除数，直到被除数小于被除数（即除不尽了）    
        while(dividend >= divisor){// 直到商小于被除数        
            quotient = getSum(quotient, 1);
            dividend = substract(dividend, divisor);
        }
        // 确定商的符号    
        if((a ^ b) < 0){// 如果除数和被除数异号，则商为负数  
            quotient = getSum(~quotient, 1);
        }
        // 确定余数符号    
        remainder = b > 0 ? dividend : getSum(~dividend, 1);
        return quotient;// 返回商
    }



}
