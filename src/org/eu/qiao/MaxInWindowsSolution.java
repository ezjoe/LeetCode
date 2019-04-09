package org.eu.qiao;

import java.util.*;

/**
 * @ClassNamg MaxInWindowsSolution
 * @Description todo
 * Author BOB
 * @Date 2019/4/9 21:45
 * @Version 1.0
 **/
public class MaxInWindowsSolution {

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if(num.length < size || size == 0)
            return res;
        for (int i = 0; i <num.length-size+1 ; i++) {
            int max = num[i];
            for (int j = i; j<i+size ; j++) {
                if (num[j]>max){
                    max=num[j];
                }
            }
            res.add(max);
        }
        return res;
    }

    public ArrayList<Integer> maxInWindows2(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();

        Deque<Integer> deque = new LinkedList<Integer>();
        if(num.length < size || size == 0)
            return res;
        for(int i = 0; i < num.length; i++){
            if(!deque.isEmpty() && deque.peekFirst() <= i - size)
                deque.poll();
            while(!deque.isEmpty() && num[deque.peekLast()] < num[i])
                deque.removeLast();
            deque.offerLast(i);
            if(i + 1 >= size)
                res.add(num[deque.peekFirst()]);
        }

        return res;
    }

}
