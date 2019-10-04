package SingletonClass;

/**
 * @Auther: Administrator
 * @Date: 2019/10/4 20:24
 * @Description: 饿汉式单例模式
 * 特点：
 * 1.是否多线程安全：是
 * 2.优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 */

public class SingletonClassLazy {
    private static final SingletonClassLazy instance = new SingletonClassLazy();

    //私有构造函数
    private SingletonClassLazy() {

    }

    public static SingletonClassLazy getInstance() {
        return instance;
    }


}
