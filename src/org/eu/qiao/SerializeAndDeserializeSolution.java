package org.eu.qiao;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassNamg SerializeAndDeserializeSolution
 * @Description todo
 * Author BOB
 * @Date 2019/4/9 16:36
 * @Version 1.0
 **/
public class SerializeAndDeserializeSolution {

    String Serialize(TreeNode root) {
        if (root == null) {
            return "#,";
        }
        StringBuffer res = new StringBuffer(root.val + ",");
        res.append(Serialize(root.left));
        res.append(Serialize(root.right));
        return res.toString();
    }

    TreeNode Deserialize(String str) {
        String[] res = str.split(",");
        Queue<String> queue = new LinkedList<String>();
        for (int i = 0; i < res.length; i++) {
            queue.offer(res[i]);
        }
        return reconstruction(queue);
    }

    TreeNode reconstruction(Queue<String> queue) {
/*        if (queue == null) {
            return null;
        }*/
        String val = queue.poll();
        if (val.equals("#"))
            return null;
        TreeNode node = new TreeNode(Integer.getInteger(val));
        node.left = reconstruction(queue);
        node.right = reconstruction(queue);
        return node;
    }
}

