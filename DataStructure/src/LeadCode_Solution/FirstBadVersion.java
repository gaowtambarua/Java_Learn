package LeadCode_Solution;

public class FirstBadVersion  {
	public FirstBadVersion()
	{
		System.out.println(firstBadVersion(4));
	}

	public int firstBadVersion(int n) {
		
		int left=1,right=n;
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			if(isBadVersion(mid))
			{
				
                right=mid-1;
			}
			else
			{
				left=mid+1;
			}
		}
		
		return left;
	}
	private boolean isBadVersion(int mid)
	{
		if(mid>=4)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
