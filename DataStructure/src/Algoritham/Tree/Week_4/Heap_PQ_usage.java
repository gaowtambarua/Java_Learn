package Algoritham.Tree.Week_4;

import java.util.*;

public class Heap_PQ_usage {
	public Heap_PQ_usage()
	{
		PriorityQueue<Integer> minpq=new PriorityQueue<Integer>();
		minpq.add(5);
		minpq.add(1);
		minpq.add(10);
		minpq.add(7);
		System.out.println("Min Heap "+minpq);
		
		PriorityQueue<Integer>  maxpq=new PriorityQueue<Integer>(Collections.reverseOrder());
		maxpq.add(5);
		maxpq.add(1);
		maxpq.add(10);
		maxpq.add(7);
		System.out.println("Max Heap "+maxpq);
	}
}
