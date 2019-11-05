package Test06;

/**
 * @Author: SongYuan
 * @Date: 2019/10/16 17:01
 * @Description:
 */
public class Node {
    Integer value;
    Node leftNode;
    Node rightNode;

    public Node() {
    }

    public Node(Integer value) {
        this.value = value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    //中序遍历
    public void middleShow() {
        //当前节点
        Node current = this;
        if (current == null) {
            return;
        }
        //左子节点
        Node leftSon = current.leftNode;
        if ( leftSon != null) {
            leftSon.middleShow();
        }
        //根节点
        System.out.println(current.value);
        //右子节点
        Node rightSon = current.rightNode;
        if (rightSon != null) {
            rightSon.middleShow();
        }
    }

    //前序遍历
    public void frontShow() {
        //当前节点
        Node current = this;
        if (current == null) {
            return;
        }
        //根节点
        System.out.println(current.value);
        //左子节点
        Node leftSon = current.leftNode;
        if ( leftSon != null) {
            leftSon.frontShow();
        }
        //右子节点
        Node rightSon = current.rightNode;
        if (rightSon != null) {
            rightSon.frontShow();
        }
    }



}
