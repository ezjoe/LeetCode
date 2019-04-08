package org.eu.qiao;

import java.util.Stack;

public class StackSolution {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> temp = new Stack<>();
    int min = Integer.MAX_VALUE;
    public void push(int node) {
        stack.push(node);
        if (node < min){
            min = node;
        }
        temp.push(min);
    }

    public void pop() {
        stack.pop();
        temp.pop();
        min = temp.pop();
        temp.push(min);
    }

    public int top() {
        int t = stack.pop();
        stack.push(t);
        return t;
    }

    public int min() {
        int m = temp.pop();
        temp.push(m);
        return m;
    }
}
