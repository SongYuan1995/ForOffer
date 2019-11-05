package ShallowCloneAndDeepClone;

/**
 * @Author: SongYuan
 * @Date: 2019/10/15 09:09
 * @Description: 对象和引用的区别
 */

class Obj{
    private int  anInt = 0;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public void changeAnInt() {
        this.anInt = 1;
    }
}





public class TestRef {


    public static void main(String[] args) {
        //java在处理基本数据类型（如int、char、double等）时，都是采用按值传递（传递的是输入参数的复制），
        // 除此之外其他类型都是按引用传递（传递的是对象的一个引用）。
        int a = 3;
        int b = a;
        b+=1;
        System.out.println("a:"+a);     //a:3
        System.out.println("b:"+b);     //b:4

        //对象除了在函数调用时是引用传递，在使用“=”赋值时也采用引用传递，示例代码如下：
        Obj obj1 = new Obj();
        Obj obj2 = obj1;    //这里只是赋值了一个引用
        obj2.changeAnInt();
        System.out.println("obj1 = " + obj1.getAnInt());    // obj1 = 1
        System.out.println("obj2 = " + obj2.getAnInt());    // obj2 = 1

    }






}
