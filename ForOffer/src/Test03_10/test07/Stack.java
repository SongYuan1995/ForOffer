package Test03_10.test07;

/**
 * @Author: SongYuan
 * @Date: 2019/10/17 14:53
 * @Description:
 */
public class Stack {
    //栈的底层使用数组来实现
    Integer[] elements;

    public Stack() {
        elements = new Integer[0];
    }

    /**
     * 向栈中压入元素
     * @param element
     */
    public void push(Integer element) {
        //建立一个新数组
        Integer[] arr = new Integer[elements.length + 1];
        //将旧数组的数据循环录入新数组
        for (int i = 0; i < elements.length; i++) {
            arr[i] = elements[i];
        }
        //录入新压入的数据
        arr[elements.length] = element;
        //用新数组替换旧数组
        elements = arr;
    }

    /**
     * 弹出栈顶元素
     * @return
     */
    public int pop () {
        if (elements.length < 1) {
            throw new RuntimeException("The stack is empty!");
        }
        //取出栈顶元素
        Integer top = elements[elements.length - 1];
        //建立一个新数组
        Integer[] arr = new Integer[elements.length - 1];
        //将旧数组中剩余的数据循环录入新数组
        for (int i = 0; i < elements.length-1; i++) {
            arr[i] = elements[i];
        }
        //用旧数组替换新数组
        elements = arr;
        //返回栈顶元素
        return top;
    }

    /**
     * 判断栈是否为空
     * @return
     */
    public Boolean isEmpty() {
        return elements.length == 0;
    }

    /**
     * 显示栈内信息
     */
    public void show() {
        for (Integer element : elements) {
            System.out.println(element);
        }
    }



}
