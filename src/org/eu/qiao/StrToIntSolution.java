package org.eu.qiao;

public class StrToIntSolution {
    public int strToInt(String str){
        if(str.length() == 0){
            return 0;
        }
        boolean flag = true;
        int i = 0;
        int res = 0;
        if(str.charAt(i) == '-'){
            flag = false;
            i++;
        }else if(str.charAt(i) == '+'){
            i++;
        }

        for (;i < str.length(); i++) {
            if (str.charAt(i) > '9' || str.charAt(i) < '0')
                return 0;
            res = res*10 + (str.charAt(i) - '0');
        }


        if (!flag)
            res = -res;

        return res;
    }
}
