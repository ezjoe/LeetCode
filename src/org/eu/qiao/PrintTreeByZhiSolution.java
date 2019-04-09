package org.eu.qiao;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @ClassNamg PrintTreeByZhiSolution
 * @Description todo
 * Author BOB
 * @Date 2019/4/9 12:37
 * @Version 1.0
 **/
public class PrintTreeByZhiSolution {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) {
            return res;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        Boolean isOdd = true;
        s1.push(pRoot);
        TreeNode tmp = null;

        while (!s1.isEmpty() || !s2.isEmpty()) {
            if (isOdd) {
                while (!s1.isEmpty()) {
                    tmp = s1.pop();
                    list.add(tmp.val);
                    if (tmp.left != null) {
                        s2.push(tmp.left);
                    }
                    if (tmp.right != null) {
                        s2.push(tmp.right);
                    }
                }
            } else {
                while (!s2.isEmpty()){
                    tmp = s2.pop();
                    list.add(tmp.val);
                    if (tmp.right != null) {
                        s1.push(tmp.right);
                    }
                    if (tmp.left != null) {
                        s1.push(tmp.left);
                    }
                }

            }

            res.add(new ArrayList<Integer>(list));
            list.clear();
            isOdd = !isOdd;
        }
        return res;
    }
}
