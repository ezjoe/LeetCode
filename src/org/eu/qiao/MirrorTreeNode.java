package org.eu.qiao;

public class MirrorTreeNode {

    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
//可有可无，数据量大时不如没有!
        if (root.left == null && root.right == null) {
            return;
        }
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        Mirror(root.left);
        Mirror(root.right);
    }
}




