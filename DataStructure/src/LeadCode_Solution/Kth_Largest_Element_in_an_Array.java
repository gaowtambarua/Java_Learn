package LeadCode_Solution;
import java.util.*;
public class Kth_Largest_Element_in_an_Array {
	
	public Kth_Largest_Element_in_an_Array()
	{
		int [] nums={1,2,3,4,5,6};
		int k=4;
		System.out.println(findKthLargest(nums,4));
	}
	public int findKthLargest(int[] nums, int k) {
		
//		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
//		for(int n : nums)
//		{
//			pq.add(n);
//		}
//		int i=1,result=0;
//		while(i<=k)
//		{
//			result=pq.poll();
//			i++;
//		}
//		return result;
		
		
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		for(int n : nums)
		{
			pq.add(n);
			if(pq.size()>k)
			{
				pq.poll();
			}
		}
		return pq.poll();
		
	}
}

