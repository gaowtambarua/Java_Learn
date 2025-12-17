package Technique;

import java.util.Collections;
import java.util.PriorityQueue;

public class Comparator {
	public Comparator()
	{
		int [] num={4,1,-1,2,-1,2,3};
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int n : num)
		{
			pq.add(n);
		}
		while(!pq.isEmpty())
		{
			System.out.print(pq.poll()+" ");
		}
		System.out.println();
		
		////////////////////////////////////////////////////////////
		////////////////// Using Comparator  ///////////////////////
		
		
		pq=new PriorityQueue<Integer>(
				(a,b)->b-a
			);
		for(int n : num)
		{
			pq.add(n);
		}
		while(!pq.isEmpty())
		{
			System.out.print(pq.poll()+" ");
		}
	}
}
