package Test03_10.test07;

/**
 * @Author: SongYuan
 * @Date: 2019/10/17 14:53
 * @Description: 队列
 */
public class Queue {

    Integer value;
    //主栈
    Stack all;
    //被当作缓存的栈
    Stack cache;

    public Queue() {
        all = new Stack();
        cache = new Stack();
    }

    /**
     * 压入元素
     * @param element
     */
    public void push(Integer element) {
        all.push(element);
    }

    /**
     * 弹出栈顶元素
     */
    public Integer pop() {
        if (all.isEmpty() && cache.isEmpty()) {
            throw new RuntimeException("the stack is empty");
        }

        if (cache.isEmpty()) {
            if (!all.isEmpty()) {
                //主栈将栈顶（最后一个进来的元素）弹出，缓存栈将弹出的元素压入（变成第一个进入）
                cache.push(all.pop());
            }
        }
        //此时弹出的元素就是一开始进入的那个元素，实现了先进先出
        return cache.pop();
    }

    public void show() {
        all.show();
    }


}
