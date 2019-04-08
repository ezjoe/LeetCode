package org.eu.qiao;

import java.util.Stack;

public class IsPopOrder {

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA.length != popA.length ||
                pushA.length == 0 ||
                popA.length == 0)
            return false;

        Stack<Integer> stack = new Stack<>();
        int j = 0;

        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.empty() && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.empty();
    }


}
