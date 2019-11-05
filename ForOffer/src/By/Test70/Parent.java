package By.Test70;

/**
 * @Author: SongYuan
 * @Date: 2019/10/21 14:48
 * @Description:
 */
public class Parent implements Comparable{
    private int age;

    public Parent(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Object o) {
        Parent parent = (Parent)o;
        System.out.println("This is parent method");
        return age> parent.age?1:age< parent.age?-1:0;
    }
}
