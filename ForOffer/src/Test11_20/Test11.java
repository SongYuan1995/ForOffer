package Test11_20;

/**
 * @Author: SongYuan
 * @Date: 2019/10/19 09:17
 * @Description:
 * 11.给定一个double类型的浮点数base和int类型的整数exponent。
 *  求base的exponent次方。不得使用库函数，不需要考虑大数问题
 *  思路：不能用==比较两个浮点数是否相等，因为有误差。考虑输入值的多种情况。
 */
public class Test11 {

    public static double power(double base, int exponent) {
        if (equal(base,0)) {
            return 0;
        } else if (exponent == 1) {
            return base;
        } else if (exponent > 0) {
            return  mutiply(base, exponent);
        } else {
            return mutiply(1/base, -exponent);
        }

    }

    public static double mutiply(double base, int e) {
        double result = 1;
        for (int i = 0; i < e; i++) {
            result *= base;
        }
        return result;
    }




    public static boolean equal(double num1, double num2) {
        if (num1-num2<0.000001 && num1 -num2 >-0.000001) {
            return true;
        }
        return false;


    }




}
