package Test03_10.test09;

/**
 * @Author: SongYuan
 * @Date: 2019/10/18 17:08
 * @Description: 写一个函数，输入 n，求斐波那契数列的第 n 项。 n<=39
 */
public class Test09 {
    //斐波那契数列：1，1，2，3，5，8，13，.....
    public static void main(String[] args) {
        int num = 20;
        long t1 = System.nanoTime();
        int num1 = findNum1(num);
        long t2 = System.nanoTime();
        System.out.println(num1+",循环耗费时间："+(t2-t1)); //21,循环耗费时间：2400;  26,循环耗费时间:2600
        long t3 = System.nanoTime();
        int num2 = findNum2(num);
        long t4 = System.nanoTime();
        System.out.println(num2+"，递归耗费时间："+(t4-t3));    //21，递归耗费时间：7600;   26,循环耗费时间:576700
    }


    public static int findNum1(int num) {
        int first = 1;
        int second = 1;
        int result = 0;
        if (num == 1) {
            return 1;
        } else if (num == 2) {
            return 1;
        } else {
            for (int i = 0; i < num-2; i++) {
                result = first +second;
                first = second;
                second = result;
            }
            return result;
        }

    }

    public static int findNum2(int num) {
        if (num <1){
            return 0;
        }
        else if (num == 1) {
            return 1;
        }else if (num == 2) {
            return 1;
        } else {
            return findNum2(num -2) + findNum2(num-1);
        }



    }


}
