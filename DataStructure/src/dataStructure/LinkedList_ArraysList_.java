package dataStructure;

import java.util.ArrayList;
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
		
	}
}
