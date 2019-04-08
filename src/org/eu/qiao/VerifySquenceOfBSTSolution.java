package org.eu.qiao;

public class VerifySquenceOfBSTSolution {


    public static void main(String[] args) {
        int[] seq = new int[]{1,2,3,4,5,6};

        System.out.println(VerifySquenceOfBST(seq));
    }

    public static boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0)
            return false;
        if (sequence.length == 1)
            return true;

        return isBST(0, sequence.length-1, sequence);
    }

    public static boolean isBST(int s, int e, int[] seq) {
        if (s >= e) {
            return true;
        }
        int i=s;

        while (i<e && seq[i]<seq[e])
            i++;

        for(int j=i; j<e; j++){
            if(seq[j] < seq[e])
                return false;
        }
        return (isBST(s, i-1, seq) && isBST(i, e-1, seq));
    }
}
