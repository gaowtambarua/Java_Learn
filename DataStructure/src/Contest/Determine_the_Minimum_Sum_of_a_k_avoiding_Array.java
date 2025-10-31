package Contest;

import java.util.*;


public class Determine_the_Minimum_Sum_of_a_k_avoiding_Array {
	public Determine_the_Minimum_Sum_of_a_k_avoiding_Array ()
	{
		System.out.println(minimumSum(2, 6));
	}
	
	public int minimumSum(int n, int k) {
		Set<Integer> set=new HashSet<Integer>();
		int result=0;
		int i=1;
		while(set.size()<n)
		{
			if(!set.contains(k-i))
			{
				set.add(i);
				result=result+i;
			}
			i++;
		}
        return result;
    }

}
