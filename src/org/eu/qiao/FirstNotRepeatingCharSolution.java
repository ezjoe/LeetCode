package org.eu.qiao;

public class FirstNotRepeatingCharSolution {

    public static void main(String[] args) {
        FirstNotRepeatingCharSolution temp = new FirstNotRepeatingCharSolution();

        String s = "abcdabc";

        System.out.println(temp.FirstNotRepeatingChar(s));

    }
    public int FirstNotRepeatingChar(String str) {
        int len = str.length();
        if(len == 0)
            return -1;
        char [] s = str.toCharArray();
        int [] m = new int[256];
        for(int i = 0; i < len; i++){
            m[s[i]]++;
        }
        for(int i = 0; i < len; i++){
            if(m[s[i]] == 1)
                return i;
        }
        return -1;
    }


}
