package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class LinkedList_ArraysList_ {
	public LinkedList_ArraysList_()
	{
		List<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<10;i++)
		{
			list.add(i);
		}
		System.out.println("This is list :  "+list);

		LinkedList<Integer> list2=new LinkedList<Integer>();
		for(int i=0;i<10;i++)
		{
			list2.addFirst(i);
		}
		System.out.println("----------------------------------------------------");
		System.out.println("This is linked list : "+list2);
		System.out.println("This is linked list : "+list2.contains(9));

		ArrayList<Integer> list3=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			list3.add(i);
		}
		System.out.println("----------------------------------------------------");
		System.out.println("This is Array list : "+list3);
		System.out.println("This is Array list : "+list3.contains(9));


		List<int[]>[] graph=new ArrayList[5+1];



		graph[0]=new ArrayList<int[]>(Arrays.asList(new int[]{1,2},new int[]{3,4}));

		System.out.println(Arrays.toString(graph[0].get(0)));
		System.out.println(Arrays.toString(graph[0].get(1)));

	}
}
