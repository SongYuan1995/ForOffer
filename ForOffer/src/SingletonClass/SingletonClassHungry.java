package SingletonClass;

/**
 * @Auther: Administrator
 * @Date: 2019/10/4 20:24
 * @Description: 懒汉式单例模式
 * 1.如果在创建实例对象时不加上synchronized则会导致对对象的访问不是线程安全的。
 * 2.建立单例对象的时间不同:
 * “懒汉式”是在你真正用到的时候才去建这个单例对象，
 * “饿汉式”是在不管用不用得上，一开始就建立这个单例对象。
 */
public class SingletonClassHungry {
    private static final SingletonClassHungry instance = null;

    //私有化构造方法
    private SingletonClassHungry() {

    }

    public synchronized static SingletonClassHungry getInstance() {
        if (instance != null) {
            return new SingletonClassHungry();
        }
        return instance;
    }




}
