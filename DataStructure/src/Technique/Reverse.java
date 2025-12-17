package Technique;

import java.util.*;

public class Reverse {
	public Reverse()
	{
		StringBuilder st=new StringBuilder("ABC").reverse();
		System.out.println(st);
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4));
		Collections.reverse(list);
		System.out.println(list);
	}
}
