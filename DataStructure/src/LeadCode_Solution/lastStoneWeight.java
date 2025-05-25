package LeadCode_Solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class lastStoneWeight {
	public lastStoneWeight()
	{
		int [] a={2,2,6};
		
		System.out.println(lastStoneWeight(a));
	}
	public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
		for(int num : stones)
		{
			maxheap.add(num);
		}
		if(maxheap.peek()==null)
		{
			return 0;
		}
		while(maxheap.size()!=1)
		{
			
			int number1=maxheap.poll();
			int number2=maxheap.poll();
			maxheap.add(number1-number2);
		}
     	return maxheap.poll();
	}
}
