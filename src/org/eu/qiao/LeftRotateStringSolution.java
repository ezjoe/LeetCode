package org.eu.qiao;

public class LeftRotateStringSolution {

    public String LeftRotateString(String str,int n) {

        if (str == null) {
            return null;
        }
        n = n%str.length();
        String str1 = str.substring(0,n);
        String str2 = str.substring(n);
        return str2 + str1;
    }


}
