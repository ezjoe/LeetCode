package org.eu.qiao;

import java.util.Stack;

public class TreeNode2LinkedList {

    TreeNode head = null;
    TreeNode pre = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        ConvertSub(pRootOfTree);
        pre.right = null;
        head.left = null;
        return head;
    }

    public void ConvertSub(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return;
        }
        Convert(pRootOfTree.left);
        change(pRootOfTree);
        Convert(pRootOfTree.right);
    }


    public TreeNode convert2(TreeNode pRootOfTree) {
        Stack<TreeNode> stack = new Stack<>();
        while (pRootOfTree != null || !stack.isEmpty()) {
            while (pRootOfTree != null) {
                stack.push(pRootOfTree);
                pRootOfTree = pRootOfTree.left;
            }
            pRootOfTree = stack.pop();
            change(pRootOfTree);
            pRootOfTree = pRootOfTree.right;
        }
        return head;
    }

    public void change(TreeNode pRootOfTree) {
        if (head == null) {
            head = pRootOfTree;
            pre = pRootOfTree;
        } else {
            pre.right = pRootOfTree;
            pRootOfTree.left = pre;
            pre = pRootOfTree;
        }

    }

}
