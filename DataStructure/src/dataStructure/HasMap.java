package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class HasMap {
	public HasMap()
	{
		Map<Integer,Integer> frq=new HashMap<Integer, Integer>();
		frq.put(3, 10);
		frq.put(6, 9);
		frq.put(10, 3);
		frq.put(11, 33);
		System.out.println(frq.get(3));
		System.out.println(frq.get(6));
		System.out.println(frq.get(10));
		System.out.println();
		
		System.out.println(frq.entrySet());
		System.out.println(frq);
		System.out.println(frq.values());
		System.out.println(frq.keySet());
		
		System.out.println(frq.get(12));
		System.out.println(frq.getOrDefault(12, 0));
		System.out.println(frq.get(12));
		
		
		HashMap<Integer,Integer>fre=new HashMap<Integer,Integer>();
		int nums[]={1,2,2,3,3,3,3,4},k=2;
		for(int val : nums)
		{
			fre.put(val,fre.getOrDefault(val,0)+1);
		}
		int sum=0;
		for(int val:fre.keySet())
		{
			if(fre.get(val)%k==0)
			{
				sum=sum+(fre.get(val))*val;
			}
		}
		System.out.println(sum);

	}
}
