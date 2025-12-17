package Technique;

import java.util.HashMap;
import java.util.Map;

public class Map_Entry {
	public Map_Entry()
	{
		Map<Integer,Integer> map=new HashMap<>();
		map.put(1, 3);
		map.put(2, 5);
		map.put(3, 2);
		System.out.println(map.entrySet());
		System.out.println();
		///  Map.Entry Using
		/// Map.Entry valiable key and value represent kore
		for(Map.Entry<Integer,Integer> k : map.entrySet())
		{
			System.out.println(k.getKey() + " = "+k.getValue());
		}
	}
}
