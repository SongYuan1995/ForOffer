package ShallowCloneAndDeepClone;

import java.util.Date;

/**
 * @Author: SongYuan
 * @Date: 2019/10/15 09:52
 * @Description: 针对非基本数据类型的clone()方法
 */


/*
* 当类中包含了一些对象时，就需要用到深复制了。
深复制的实现方法是在对象调用 clone() 方法完成复制后，接着对对象中的非基本类型的属性也调用 clone() 方法完成深复制。*/


class Obj3 implements Cloneable{
    private Date birth = new Date(); // 非基本数据类型

    public Date getBirth() {        return birth;    }

    public void setBirth(Date birth) {        this.birth = birth;    }

    public void changeBirth() {
        this.birth.setTime(0);
    }

    @Override
    protected Object clone()  {
        Obj3 o = null;
        try {
            o = (Obj3) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // 实现深复制，对对象中的非基本类型（birth）进行复制。
        o.birth = (Date) this.getBirth().clone();

        return o;
    }
}




public class TestClone2 {
    public static void main(String[] args) {
        Obj3 a = new Obj3();
        Obj3 b = (Obj3) a.clone(); // clone()函数返回的是一个新的对象而不是一个引用
        b.changeBirth();
        System.out.println("a = " + a.getBirth());    // a = Tue Oct 15 10:05:36 CST 2019
        System.out.println("b = " + b.getBirth());    // b = Thu Jan 01 08:00:00 CST 1970




    }

}

/*
* 深复制和浅复制的区别：
* 1.浅复制（Shallow Clone）：被复制对象的所有变量都含有与原来对象相同的值，而所有对其他对象的引用仍然指向原来的对象。
*   换言之，浅复制仅仅复制所考虑的对象，而不复制它的引用对象
* 2.深复制（Deep Clone）：被复制对象的所有变量都含有与原来对象相同的值，除去那些引用其他对象的变量。
*   那些引用其他对象的变量将指向被复制的新对象。
*   换言之，深复制把复制的对象所引用的对象都复制了一遍。*/