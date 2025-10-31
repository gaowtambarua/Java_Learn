package Contest;

public class Minimum_Operations_to_Transform_Array {
	public Minimum_Operations_to_Transform_Array()
	{
		//		int[] nums1 = {2};
		//		int[] nums2 = {3,4};

		int[] nums1 = {753,357};
		int[] nums2 = {271,520,413};

		System.out.println(minOperations(nums1,nums2));
	}
	public long minOperations(int[] nums1, int[] nums2) { 
		int result=1,min=Integer.MAX_VALUE,n=nums1.length;

		for(int i=0;i<n;i++)
		{
			result=result+Math.abs(nums1[i]-nums2[i]);
			if(min!=0&&((nums1[i]>=nums2[n]&&nums2[i]<=nums2[n])||(nums2[n]>=nums1[i]&&nums2[n]<=nums2[i])))
			{
				min=0;
			}
			if(min!=0)
			{
				min=Math.min(min, Math.abs(nums1[i]-nums2[n]));
				min=Math.min(min, Math.abs(nums2[i]-nums2[n]));
			}
		}
		return result+min;  
	}
}
