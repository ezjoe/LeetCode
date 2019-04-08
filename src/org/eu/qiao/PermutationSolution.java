package org.eu.qiao;

import java.util.ArrayList;
import java.util.Collections;

public class PermutationSolution {

    ArrayList<String> res = new ArrayList<>();

    public static void main(String[] args) {
        PermutationSolution ps = new PermutationSolution();

        String str = "aab";

        System.out.println(ps.Permutation(str));


    }
    public ArrayList<String> Permutation(String str) {
        if (str == null) {
            return null;
        }

        permutationRecursion(str.toCharArray(), 0);
        Collections.sort(res);
        return res;
    }

    public void permutationRecursion(char[] chars, int i) {
        if (i == chars.length - 1) {
            res.add(String.copyValueOf(chars));
        }else {
            for (int j = i; j < chars.length; j++) {
                if(i!=j && chars[i] == chars[j])
                    continue;
                swap(chars, i, j);
                permutationRecursion(chars, i+1);
                swap(chars, i, j);
            }
        }


    }

    public void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
