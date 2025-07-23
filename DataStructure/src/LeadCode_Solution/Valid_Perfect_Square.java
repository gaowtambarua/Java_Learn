package LeadCode_Solution;

public class Valid_Perfect_Square {
	public Valid_Perfect_Square()
	{
		System.out.println(isPerfectSquare(15));
	}
	public boolean isPerfectSquare(int num) {
		
		 long left=0,right=num;
	      
			while(left<=right)
			{
				long mid=left+(right-left)/2;
	            long square = mid*mid;
				if(square==num)
				{
					return true;
				}
				else if(square<num)
				{
					left=mid+1;
				}
				else
				{
					right=mid-1;
				}
			}
			return false;
		
		//return Math.sqrt(num)==Math.round(Math.sqrt(num));
	}
}
