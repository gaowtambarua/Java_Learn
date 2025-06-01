package dataStructure;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	public PriorityQueueExample()
	{
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

        maxHeap.add(5);
        maxHeap.add(1);
        maxHeap.add(10);

        System.out.println(maxHeap.poll()); // 10
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.poll());// 5
	}
}
