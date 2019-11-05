package ShallowCloneAndDeepClone;

/**
 * @Author: SongYuan
 * @Date: 2019/10/15 09:30
 * @Description: 针对基本数据类型的clone()方法
 */

/*java中所有的类默认都是继承自 Object 类，而 Object 类中提供了一个 clone() 方法。
 这个方法的作用是返回一个 Object 对象的复制。这个复制函数返回的是一个新的对象而不是一个引用。*/
/*使用 clone() 方法的步骤：
* 1.实现clone的类首先需要实现 Cloneable 接口。Cloneable 接口实际上是一个标识接口，没有任何接口方法。
* 2.在类中重写 Object 类中的 clone() 方法
* 3.在 clone() 方法中调用 super.clone()。无论 clone 类的继承接口是什么，super.clone() 都会直接或间接调用 java.lang.Object 类的 clone() 方法。
* 4.把浅复制的引用指向原型对象新的克隆体。
* */

class Obj2 implements Cloneable{
    private int  anInt = 0; //基本数据类型

    public int getAnInt() {       return anInt;    }

    public void setAnInt(int anInt) {        this.anInt = anInt;    }

    public void changeAnInt() {        this.anInt = 1;    }

    @Override
    public Object clone() {
        Obj2 o = null;
        try {
            o = (Obj2) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }

}



public class TestClone {
    public static void main(String[] args) {
        Obj2 a = new Obj2();
        Obj2 b = (Obj2) a.clone();  // // clone()函数返回的是一个新的对象而不是一个引用
        b.changeAnInt();
        System.out.println("a = " + a.getAnInt());    // a = 0
        System.out.println("b = " + b.getAnInt());    // b = 1


    }


}
