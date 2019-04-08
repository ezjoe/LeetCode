package org.eu.qiao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GetLeastNumbersSolution {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if (input == null || k == 0 || k > input.length) {
            return null;
        }

        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(input);

        for (int i = 0; i < k ; i++) {
            res.add(input[i]);
        }


        return res;
    }

    public ArrayList<Integer> GetLeastNumbers_Solution2(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(input == null || k ==0 || k > input.length)
            return res;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            public int compare(Integer e1, Integer e2) {
                return e2 - e1;
            }
        });
        for(int i=0; i<input.length; i++){
            if(maxHeap.size() != k)
                maxHeap.offer(input[i]);
            else{
                if(maxHeap.peek() > input[i]){
                    maxHeap.poll();
                    maxHeap.offer(input[i]);
                }
            }
        }
        for(Integer i: maxHeap){
            res.add(i);
        }
        return res;
    }

}
