package Technique;
import java.util.*;
public class To_K_Frequent_Elements {


	public To_K_Frequent_Elements()
	{
		int [] nums={1,1,1,2,2,3};
		int k=2;
		int [] result=Arrays.copyOf(topKFrequent(nums,k), k);
		for(int n : result)
		{
			System.out.print(n+ " ");
		}
		
	}
	public int[] topKFrequent(int[] nums, int k) {
		int [] result=new int [k];
		Map<Integer,Integer> mapFrequency=new HashMap<>();
		for(int num : nums)
		{
			mapFrequency.put(num,mapFrequency.getOrDefault(num,0)+1);
		}
		PriorityQueue<Map.Entry<Integer, Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
		pq.addAll(mapFrequency.entrySet());
		for(int i=0; i<k;i++)
		{
			result[i]=pq.poll().getKey();
		}
		
		return result;
	}
}
