package SingletonClass;

/**
 * 实现单例模式
 * 饿汉式单例类
 */
public class SingletonClass1 {
    private static final SingletonClass1 singletonClass1 = new SingletonClass1();

    //私有构造函数
    private SingletonClass1() {

    }

    public static SingletonClass1 getInstance() {
        return singletonClass1;
    }


}
