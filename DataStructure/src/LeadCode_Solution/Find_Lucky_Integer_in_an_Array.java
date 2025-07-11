package LeadCode_Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Find_Lucky_Integer_in_an_Array {
	public Find_Lucky_Integer_in_an_Array()
	{
		int [] arr={3,3,0,3,2,1};
		System.out.println(findLucky(arr));
	}
	public int  findLucky(int[] arr) {
//		if(arr.length<1)
//		{
//			return -1;
//		}
//		Arrays.sort(arr);
//		int [] count=new int [arr[arr.length-1]+1];
//		
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			count[arr[i]]=count[arr[i]]+1;
//		}
//		for(int i=0;i<count.length;i++)
//		{
//			if(i!=count[i])
//			{
//				count[i]=-1;
//			}
//		}
//		Arrays.sort(count);
//		System.out.println(Arrays.toString(count));
//		
//		return count[count.length-1]==0?-1:count[count.length-1];
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////// 
		
		
//		int [] count=new int[501];
//		for(int num:arr)
//		{
//			count[num]=count[num]+1;
//		}
//		int max=-1;
//		for(int i=1;i<=500;i++)
//		{
//			if(i==count[i])
//			{
//				max=i;
//			}
//		}
//		return max;
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////// 
		///////int [] arr={1,3,1,3,0,3,2};
		
		Map<Integer,Integer> fre=new HashMap<Integer, Integer>();
		for(int n : arr)
		{
			fre.put(n, (fre.getOrDefault(n, 0)+1));
		}
		int max=-1;
		for(int n:fre.keySet())
		{
			if(n==fre.get(n))
			{
				max=n;
			}
		}
		return max;
	}
}

