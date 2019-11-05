package QuestionList;

import java.security.PublicKey;
import java.sql.SQLOutput;

/**
 * @Author: SongYuan
 * @Date: 2019/10/15 18:13
 * @Description:
 */
public class Outer {
    static int num = 1;

    int num2 = 3;
    public  void  method() {
        //匿名内部类
        new Thread(new Runnable() {
            public void run (){};

        }).start();

    }
    //static nested class
    public static class inner1 {

    }
    public class inner2{
        //jdk1.8以后已经不需要在内部类引用局部变量时加final关键字了
        int a = num2 +1;
    }



    public static void main(String[] args) {

        Outer outer = new Outer();
        //静态内部类创建
        inner1 inner1 = new inner1();
        //非静态内部类创建
        inner2 inner2 = outer.new inner2();

        outer.getClass().getName();
    }
}


