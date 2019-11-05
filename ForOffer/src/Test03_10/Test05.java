package Test03_10;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: SongYuan
 * @Date: 2019/10/8 19:36
 * @Description: ：输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class Test05 {

    public static ArrayList printNode(Node node) {
        ArrayList<Node> list = new ArrayList<>();
        if(node.next != null) {
            printNode(node.next);
        }
        list.add(node);
        System.out.println(node.data);
        return list;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.append(node2).append(node3).append(node4);
        Test05.printNode(node1);


    }




}
