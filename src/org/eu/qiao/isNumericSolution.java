package org.eu.qiao;

public class isNumericSolution {

    public boolean isNumeric(char[] str) {
        boolean hasDecimal = false;
        boolean hasE = false;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '+' || str[i] == '-') {
                if (i == 0 || str[i-1] == 'e' || str[i-1] == 'E') {
                    continue;
                } else {
                    return false;
                }
            } else if (str[i] == 'e' || str[i] == 'E') {
                if (!isCharNum(str, i-1) || hasE || !(isCharNum(str,i+1)||isCharNum(str,i+2))) {
                    return false;
                }
                hasE = true;
            } else if (str[i] == '.') {
                if (hasE || hasDecimal || !isCharNum(str, i+1))
                    return false;
                hasDecimal = true;
            } else if (str[i] > '9' || str[i] < '0') {
                return false;
            }
        }
        return true;
    }

    public boolean isCharNum(char[] str, int i) {
        if (i < str.length && (str[i] >= '0' && str[i] <= '9')) {
            return true;
        } else return false;
    }
}
