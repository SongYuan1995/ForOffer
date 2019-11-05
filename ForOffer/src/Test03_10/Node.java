package Test03_10;

/**
 * @Auther: SongYuan
 * @Date: 2019/10/8 19:43
 * @Description:链表结构
 */
public class Node {
    //节点数据
    int data;
    //下一个节点
    Node next;

    public Node(int data) {
        this.data = data;
    }

    //追加节点
    public Node append(Node node) {
        //当前节点
        Node current = this;

        while (true) {
            //取出下一个节点
            Node next = current.next;
            //如果下一个节点不为null
            if (current.next != null) {
                current = current.next;
            } else {
                break;
            }
        }

        //追加下一个节点
        current.next = node;
        return this;

    }


}
