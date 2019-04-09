package org.eu.qiao;

/**
 * @ClassNamg GetNextSolution
 * @Description [剑指offer] 二叉树的下一个结点
 * Author BOB
 * @Date 2019/4/8 14:33
 * @Version 1.0
 **/
public class GetNextSolution {
    public TreeLinkNode GetNext(TreeLinkNode pNode){

        TreeLinkNode res = null;
        if (pNode == null) {
            return null;
        }
        if (pNode.right == null) {
            res = pNode.next;
            while (res != null && pNode != res.left ){
                res = res.next;
                pNode = pNode.next;
            }
        }else {
            res = pNode.right;
            while (res.left!=null){
                res = res.left;
            }
        }
        return  res;
    }

}
