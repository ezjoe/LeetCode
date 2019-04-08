package org.eu.qiao;

import java.util.ArrayList;

public class FindPatchSolution {

    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> tempres = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        FindPatchSolution patch = new FindPatchSolution();
        System.out.println(patch.FindPath(root,3));


    }


    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null)
            return res;

        preOrederPatch(root, target);
        return res;
    }

    public void preOrederPatch(TreeNode root, int tempv) {
        tempres.add(root.val);
        if (root.left != null) {
            preOrederPatch(root.left, tempv - root.val);
        }
        if (root.right != null) {
            preOrederPatch(root.right, tempv - root.val);
        }
        if (root.left == null && root.right == null && root.val == tempv){
            res.add(new ArrayList<Integer>(tempres));
        }
        tempres.remove(tempres.size()-1);
    }

}
