package By.Test70;

/**
 * @Author: SongYuan
 * @Date: 2019/10/21 14:56
 * @Description:
 */
public class Child extends Parent {

    public Child() {
        super(3);
    }

    @Override
    public int compareTo(Object o) {
        System.out.println("this is child method;");
        return 1;
    }
}
