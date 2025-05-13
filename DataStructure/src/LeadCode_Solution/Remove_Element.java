package LeadCode_Solution;

public class Remove_Element {
	public Remove_Element()
	{
		int[] nums={3,2,3,3,5,6};
		int val = 3;
		System.out.println(removeElement(nums,val));

	}

	public int removeElement(int[] nums, int val) {
		int j=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=val)
			{
				nums[j]=nums[i];
				j++;
			}
		}
		
		return j;
	}
}
