package dataStructure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Data_Save_Problem {
	public Data_Save_Problem()
	{
		//////////// LinkList Problem
		List<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("For LinkList Problem.\nSize = "+list.size());
		System.out.println(list);

		List<List<Integer>> result=new LinkedList<List<Integer>>();

		/////////////////////////////////
		result.add(new LinkedList<>(list));
		result.add(list);
		result.add(new LinkedList<>(list));
		/////////////////////////////////



		System.out.println(result);
		list.remove(2);
		System.out.println(result);
		System.out.println("\n/////////////////////////////////");

		////////////Array Problem
		int a[]={1,2,3,4,5};
		System.out.println("For Array Problem.\nSize = "+a.length);
		System.out.println(Arrays.toString(a));
		int b[][]=new int[3][];
		
		b[0]=a;
		b[1]=Arrays.copyOf(a, a.length);
		
		a[2]=0;
		System.out.println(Arrays.toString(b[0])+", "+Arrays.toString(b[1]));



	}
}
