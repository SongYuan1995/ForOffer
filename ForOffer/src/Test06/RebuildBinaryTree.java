package Test06;

import java.util.Arrays;

/**
 * @Author: SongYuan
 * @Date: 2019/10/16 17:01
 * @Description:
 * 题目描述：输入二叉树的前序遍历和中序遍历的结果，重建出该二叉树。
 * 假设前序遍历和中序遍历结果中都不包含重复的数字，
 * 例如输入的前序遍历序列 {1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}重建出如图所示的二叉树。
 */
public class RebuildBinaryTree {

    public static Node BinaryTree(int[] pre, int[] middle) {
        if (pre == null || middle == null) {
            return null;
        }

        if (pre.length ==0 || middle.length==0) {
            return null;
        }
        if (pre.length != middle.length) {
            return null;
        }

        Node root = new Node();
        for (int i = 0; i < middle.length; i++) {
            if (pre[0] == middle[i]) {
                root.value = pre[0];
                root.leftNode = BinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(middle, 0, i));
                root.rightNode = BinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(middle, i + 1, middle.length));
            }

        }

        return root;
    }

    public static void main(String[] args) {
        int[] pre = new int[] {1,2,4,7,3,5,6,8};
        int[] mid = new int[] {4,7,2,1,5,3,8,6};
        Node root = RebuildBinaryTree.BinaryTree(pre, mid);
        System.out.println(root.value);
        System.out.println("************");
        root.middleShow();
        System.out.println("************");
        root.frontShow();




    }



}
