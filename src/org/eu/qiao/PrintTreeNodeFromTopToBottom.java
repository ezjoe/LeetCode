package org.eu.qiao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeNodeFromTopToBottom {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList();

        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        ((LinkedList<TreeNode>) queue).add(root);

        while (!queue.isEmpty()) {
            root = ((LinkedList<TreeNode>) queue).pop();
            if (root.left != null) {
                ((LinkedList<TreeNode>) queue).add(root.left);
            }
            if (root.right != null) {
                ((LinkedList<TreeNode>) queue).add(root.right);
            }
            res.add(root.val);
        }
        return res;
    }


}
