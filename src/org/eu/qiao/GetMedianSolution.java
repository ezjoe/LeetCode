package org.eu.qiao;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @ClassNamg GetMedianSolution
 * @Description todo
 * Author BOB
 * @Date 2019/4/9 21:01
 * @Version 1.0
 **/
public class GetMedianSolution {
    //保证两堆顶部是中位数或其边上的数字
    // 最小堆，存储大数字
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    // 最大堆，存储小数字
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(15, new Comparator<Integer>() {
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });
    // 保证maxHeap.size()>=minHeap.size()


    public void Insert(Integer num) {
        // 先按大小插入，再调整
        if (maxHeap.isEmpty() || num <= maxHeap.peek())
            maxHeap.offer(num);
        else
            minHeap.offer(num);

        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.peek());
            minHeap.poll();
        } else if (maxHeap.size() - minHeap.size() == 2) {
            minHeap.offer(maxHeap.peek());
            maxHeap.poll();
        }

    }

    public Double GetMedian() {
        if (maxHeap.size() > minHeap.size())
            return new Double(maxHeap.peek());
        else
            return new Double(maxHeap.peek() + minHeap.peek()) / 2;
    }

}


