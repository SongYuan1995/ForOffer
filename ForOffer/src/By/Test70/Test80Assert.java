package By.Test70;

/**
 * @Author: SongYuan
 * @Date: 2019/10/21 16:00
 * @Description: 什么时候用 assert。
 * ，assertion 就是在程序中的一条语句，它对一个 boolean 表达式进行检查，
 * 一个正确程序必须保证这个 boolean 表达式的值为 true；
 * 如果该值为 false，说明程序已经处于不 正确的状态下，assert 将给出警告或退出。
 * 一般来说，assertion用于保证程序最基本、关键的正确性。assertion 检查通常在开发和测试时开启。
 * 为了提高性能，在软件发布后， assertion 检查通常是关闭的。
 */
public class Test80Assert {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }
        --i;

        assert i == 5 :"i不等于5，i目前的值是"+i;
        System.out.println(i);
    }




}
