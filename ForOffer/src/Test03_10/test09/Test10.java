package Test03_10.test09;

/**
 * @Author: SongYuan
 * @Date: 2019/10/18 17:38
 * @Description: 10.输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 思路： a&(a-1)的结果会将a最右边的1变为0，直到a = 0，
 */
public class Test10 {


    public static void main(String[] args) {
        int num = 8;
        System.out.println(count1(-5));


    }
    public static int count1(int num) {
        int count = 0;
        while (num != 0) {
            num = num&(num -1);
            count ++;
        }
        return count;
    }


}
