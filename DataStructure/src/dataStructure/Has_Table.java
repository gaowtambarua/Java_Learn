package dataStructure;

import java.util.Hashtable;

public class Has_Table {
	public Has_Table()
	{
		Hashtable<Double,Double> seen=new Hashtable<Double, Double>();
		seen.put(3.2,3.2);
		seen.put(3.4,3.2);
		seen.put(3.2,3.2);
		System.out.println(seen.get(3.4));
		System.out.println(seen);
	}
}
