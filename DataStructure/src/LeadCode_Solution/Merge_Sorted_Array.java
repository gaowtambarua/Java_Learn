package LeadCode_Solution;

public class Merge_Sorted_Array {
	
	public Merge_Sorted_Array()
	{
		int[] nums1={1,2,3,0,0,0};
		int m=3;
		int[] nums2 ={2,5,6};
		int n=3;
		merge(nums1, m, nums2, n);
	}
	
	public void merge(int[] nums1, int m, int[] nums2, int n)
	{
		int i=0;
		int j=0;
		int k=0;
		int [] a =new int[m+n];
		while(i<m&&j<n)
		{
			if(nums1[i]<nums2[j])
			{
				a[k]=nums1[i];
				i++;
			}
			else
			{
				a[k]=nums2[j];
				j++;
			}
			k++;
		}
		while(i!=m)
		{
			a[k]=nums1[i];
			i++;
			k++;
		}
		
		while(j!=n)
		{
			a[k]=nums2[j];
			j++;
			k++;
		}
		
		// Copy back to nums1
	    for (int t = 0; t < k; t++) {
	        nums1[t] = a[t];
	    }
	}
	
}
