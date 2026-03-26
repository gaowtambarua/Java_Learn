package dataStructure;

import java.util.*;

public class hashSet {
	public hashSet()
	{
		HashSet<Integer> aa=new HashSet<Integer>();
		aa.add(1);
		aa.add(2);
		aa.add(3);
		aa.add(1);
		aa.add(2);
		aa.add(3);
		System.out.println(aa);
		
		
		int[] arr1 = {7,1,14,11};
		System.out.println(checkIfExistJava(arr1)); 
		
		
		
		
		////////////////////////////////////////////////////////////////////////////
		Set<Integer> set = new TreeSet<>(Collections.reverseOrder());

		set.add(5);
		set.add(1);
		set.add(3);

		System.out.println(set);
		
		
		
		//////////////////////////////////////////////////
		
		TreeSet<Integer> set2 = new TreeSet<>();

		set2.add(5);
		set2.add(1);
		set2.add(3);
		set2.add(2);

		set2.pollFirst();

		System.out.println(set2);
		
		
		
		
	}
	//////////////////////////////////////////Java basic code leadcode problem 1346 code	
	public boolean checkIfExistJava(int[] arr) {
		HashSet<Integer> seen=new HashSet<Integer>();
		for(int num:arr)
		{
			if(seen.contains(num*2)||(num%2==0&&seen.contains(num/2)))
			{
				return true;
			}
			seen.add(num);
		}
		return false;
	}
}
