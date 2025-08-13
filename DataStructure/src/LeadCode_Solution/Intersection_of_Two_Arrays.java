package LeadCode_Solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Intersection_of_Two_Arrays {
	public Intersection_of_Two_Arrays()
	{
		int [] nums1 = {4,9,5};
		int [] nums2 = {9,4,9,8,4};
		System.out.println(Arrays.toString(intersection(nums1,nums2)));
	}
	/////////////////////// HashMap ///////////////
//	public int[] intersection(int[] nums1, int[] nums2) {
//		HashMap<Integer, Integer> mapNums1=new HashMap<Integer, Integer>();
//		for(int num : nums1)
//		{
//			mapNums1.put(num, num);
//		}
//		HashMap<Integer, Integer> mapinter=new HashMap<Integer, Integer>();
//		for(int num : nums2)
//		{
//			if(mapNums1.containsKey(num))
//			{
//				mapinter.put(num,num);
//			}
//		}
//		int [] result= new int [mapinter.size()];
//		int i=0;
//		for(int num :mapinter.values())
//		{
//			result[i]=num;
//			i++;
//		}
//		
//		return result;
//	}
	
	////////// HashSet ////////////////////
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> mapNums1=new HashSet<Integer>();
		for(int num : nums1)
		{
			mapNums1.add(num);
		}
		Set<Integer> mapinter=new HashSet<Integer>();
		for(int num : nums2)
		{
			if(mapNums1.contains(num))
			{
				mapinter.add(num);
			}
		}
		int [] result= new int [mapinter.size()];
		int i=0;
		for(int num :mapinter)
		{
			result[i]=num;
			i++;
		}
		
		return result;
	}
	
}
