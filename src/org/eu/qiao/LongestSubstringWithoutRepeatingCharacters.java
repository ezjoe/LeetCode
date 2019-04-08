package org.eu.qiao;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abbbcas";
        int res;
        res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }

    public static int lengthOfLongestSubstring(String s) {
        int res=0;
        int i=0,j=1;
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;
        while(j < s.length()){
            int k= i;
            for (k = i; k <j ; k++) {
                if(s.charAt(k) == s.charAt(j)){
                    res=((res>(j-i))?res:(j-i));
                    i=k+1;
                    break;
                }
            }
            j++;
        }
        res=((res>(j-i))?res:(j-i));
        return res;
    }
}
