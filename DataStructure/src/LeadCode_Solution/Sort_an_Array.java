package LeadCode_Solution;

import java.util.Arrays;

public class Sort_an_Array {
	public Sort_an_Array()
	{
		int[] nums={5,2,3,1};
		System.out.println(Arrays.toString(sortArray(nums)));
	}

	public int[] sortArray(int[] nums) {
		if(nums.length==1)
		{
			return nums;
		}
		int mid=nums.length/2;
		int [] left=Arrays.copyOfRange(nums,0,mid);
		int [] right=Arrays.copyOfRange(nums, mid,nums.length);
		sortArray(left);
		sortArray(right);
		merge(nums,left,right);
		
		return nums;
	}
	
	private void merge(int [] arr,int [] left,int [] right)
	{
		int i=0,j=0,k=0;
		
		//arr={9,3};

		while (i<left.length&&j<right.length) 
		{
			if(left[i]<right[j])
			{
				arr[k]=left[i];
				i++;
				k++;
			}
			else
			{
				arr[k]=right[j];
				j++;
				k++;
			}
		}
		
		while(i<left.length)
		{
			arr[k]=left[i];
			k++;
			i++;
		}
		while (j < right.length) {
            arr[k] = right[j];
            k++;
            j++;
        }

	}
}
