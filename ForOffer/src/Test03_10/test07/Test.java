package Test03_10.test07;

/**
 * @Author: SongYuan
 * @Date: 2019/10/17 14:53
 * @Description: 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class Test {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(4);
        queue.push(3);
        queue.push(2);
        queue.push(1);
//        queue.show();
        //弹出元素
        System.out.println(queue.pop());
        queue.show();
    }






}
