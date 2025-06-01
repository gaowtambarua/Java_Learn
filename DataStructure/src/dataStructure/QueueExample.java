package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public QueueExample()
	{
		////First In First Out
		Queue<String> queue = new LinkedList<String>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println(queue.poll()); // A
        System.out.println(queue.peek()); // B
        System.out.println(queue.poll());
        System.out.println(queue.peek());
	}
}
