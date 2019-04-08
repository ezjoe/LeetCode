package org.eu.qiao;

public class MatchSolution {

    public boolean match(char[] str, char[] pattern) {
        if (str == null && pattern == null) {
            return false;
        }

        return matchCore(str, 0, pattern, 0);
    }

    public boolean matchCore(char[] str, int si, char[] pattern, int pi) {
        if (si >= str.length && pi >= pattern.length) {
            return true;
        }
        if (pi >= pattern.length && si < str.length) {
            return false;
        }
        if (pi + 1 < pattern.length && pattern[pi + 1] == '*') {
            if (si < str.length && (pattern[pi] == '.' || str[si] == pattern[pi])) {
                return matchCore(str, si + 1, pattern, pi + 2) ||
                        matchCore(str, si + 1, pattern, pi) ||
                        matchCore(str, si, pattern, pi + 2);
            } else return matchCore(str, si, pattern, pi + 2);
        } else if (si < str.length && (pattern[pi] == '.' || pattern[pi] == str[si])) {
            return matchCore(str, si + 1, pattern, pi + 1);
        }
        return false;
    }


}
