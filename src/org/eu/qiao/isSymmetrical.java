package org.eu.qiao;

import java.util.Stack;

/**
 * @ClassNamg isSymmetrical
 * @Description todo
 * Author BOB
 * @Date 2019/4/9 12:23
 * @Version 1.0
 **/
public class isSymmetrical {

    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null)
            return true;
        return isSymmetrical(pRoot.left, pRoot.right);
    }

    boolean isSymmetrical(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.val != right.val) {
            return false;
        }
        return isSymmetrical(left.left, right.right) &&
                isSymmetrical(left.right, right.left);
    }

    /**
     * 非递归方法，用stack
     * @param pRoot
     * @return
     */

    boolean isSymmetrical2(TreeNode pRoot)
    {
        if(pRoot == null)
            return true;
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(pRoot.left);
        s.push(pRoot.right);
        while(!s.isEmpty()){
            TreeNode right = s.pop();
            TreeNode left = s.pop();
            if(right == null && left == null)
                continue;
            if(right == null || left == null)
                return false;
            if(right.val != left.val)
                return false;
            s.push(left.left);
            s.push(right.right);
            s.push(left.right);
            s.push(right.left);
        }
        return true;
    }


}
