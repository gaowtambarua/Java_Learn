package Algoritham;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Subset{
	public Subset()
	{
		int [] nums={1,2,3};
		List<List<Integer>> list=new ArrayList<>();
		list.add(new ArrayList<Integer>());
		
		for(int num :nums)
		{
			
			int n=list.size();
			for(int i=0;i<n;i++)
			{
				List<Integer> list2=new ArrayList<>(list.get(i));
				list2.add(num);
				list.add(list2);
			}
		}
		System.out.println(list);
	}
}



//public class Subset {
//	public Subset()
//	{
//		int [] nums={1,2,3};
//		k();
//		
////		List<List<Integer>> a=new ArrayList<>();
////		a.add(new ArrayList<>());
////		for(int num: nums)
////		{
////			int n=a.size();
////			for(int i=0;i<n;i++)
////			{
////				
////					List<Integer> a2=new ArrayList<Integer>(a.get(i));
//////					a2=a.get(i);
////					a2.add(num);
////					
////					a.add(a2);
////				
////			}
////		 
////		}
////		System.out.println(a);
//		
//	}
//	private void k()
//	{
//		
//		int [] nums={1,2,3};
//		System.out.println(Arrays.toString(nums));
//		int [] k=new int [0];
//		k=Arrays.copyOf(nums, 4);
//		k[3]=4;
//		System.out.println(Arrays.toString(k));
////		nums[2]=5;
////		System.out.println(Arrays.toString(nums));
//	}
//}
