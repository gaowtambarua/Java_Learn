package dataStructure;

import java.util.HashSet;

public class hashSet {
	public hashSet()
	{
		int[] arr1 = {2,0,10,-19,4,6,-8};
		System.out.println(checkIfExistJava(arr1)); 
	}
	//////////////////////////////////////////Java basic code 1346 code	
	public boolean checkIfExistJava(int[] arr) {
		HashSet<Integer> seen=new HashSet<Integer>();
		for(int num:arr)
		{
			if(seen.contains(num*2)||(num % 2 == 0 && seen.contains(num / 2)))
			{
				return true;
			}
			seen.add(num);
		}
		return false;
	}
}
