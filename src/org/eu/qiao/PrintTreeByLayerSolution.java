package org.eu.qiao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassNamg PrintTreeByLayerSolution
 * @Description todo
 * Author BOB
 * @Date 2019/4/9 16:00
 * @Version 1.0
 **/
public class PrintTreeByLayerSolution {

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null)
            return res;
        ArrayList<Integer> templist = new ArrayList<Integer>();
        Queue<TreeNode> layer = new LinkedList<TreeNode>();
        int len = 1;
        int nextlen = 0;
        layer.add(pRoot);
        TreeNode tempTreeNode = null;
        while (!layer.isEmpty()){
            for (int i = 0; i < len; i++) {
                tempTreeNode = layer.poll();
                templist.add(tempTreeNode.val);
                if (tempTreeNode.left != null) {
                    layer.offer(tempTreeNode.left);
                    nextlen++;
                }
                if (tempTreeNode.right != null) {
                    layer.offer(tempTreeNode.right);
                    nextlen++;
                }
            }
            res.add(new ArrayList<>(templist));
            templist.clear();
            len = nextlen;
            nextlen = 0;
        }

        return res;
    }


}
