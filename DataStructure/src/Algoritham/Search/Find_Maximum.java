package Algoritham.Search;

public class Find_Maximum {
	public Find_Maximum()
	{
		// ,3,4,5,6,7,9,10
		int [] a={20, 129, 134, 1};
		System.out.println(findMax(a));
	}
	public int findMax(int [] num)
	{
		int left=0,right=num.length-1;
		while(left<right)
		{
			int mid=left+(right-left)/2;
			if(num[mid]<num[right])
			{
				if(num[left]>num[right])
				{
					right=mid-1;
				}
				else
				{
					left=mid+1;
				}
			}
			else
			{
				if(num[mid+1]<num[mid])
				{
					right=mid;
				}
				else
				{
					left =mid+1;
				}
			}
		}
		return num[left];
	}
}
