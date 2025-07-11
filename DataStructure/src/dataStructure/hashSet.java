package dataStructure;

import java.util.HashSet;

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
