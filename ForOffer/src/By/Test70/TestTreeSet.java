package By.Test70;

import java.util.TreeSet;

/**
 * @Author: SongYuan
 * @Date: 2019/10/21 14:47
 * @Description: TreeSet里面放对象，如果同时放入了父类和子类的实例对象，
 * 那比较时使用的是父类的 compareTo 方法，还是使用的子类的 compareTo 方法，还是抛异常?
 * 答案：
 * （应该是没有针对问题的确切的答案,
 * 当前的add方法放入的是哪个对象，就调用哪个象的compareTo方法，至于这个compareTo方法怎么做，就看当前这个对象的类中是如
 * 何编写这个方法的)
 *
 */
public class TestTreeSet {

    public static void main(String[] args) {
        TreeSet tree = new TreeSet();
        tree.add(new Parent(3));
        tree.add(new Child());
        tree.add(new Parent(1));
        System.out.println(tree.size());
    }





}
