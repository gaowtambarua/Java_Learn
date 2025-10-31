package LeadCode_Solution;

public class Sum_of_Square_Numbers {
	public Sum_of_Square_Numbers()
	{
		System.out.println(judgeSquareSum(1000000));
	}
	public boolean judgeSquareSum(int c) {

		long a=0,b=(long)Math.sqrt(c);
		while(a<=b)
		{
			long val=(a*a+b*b);
			if(val>c)
			{
				b=b-1;
			}
			else if(val<c)
			{
				a=a+1;
			}
			else 
			{
				return true;
			}
		}

		return false;
	}
}
