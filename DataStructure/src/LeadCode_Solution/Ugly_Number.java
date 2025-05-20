package LeadCode_Solution;

public class Ugly_Number {
	public Ugly_Number()
	{
		System.out.println(isUgly(4));
	}
	public boolean isUgly(int n) {
		if(n<=0)
		{
			return false;
		}
		int [] a={2,3,5};
		for(int num : a)
		{
			while(n%num==0)
			{
				n=n/num;
			}
		}
		return n==1;
	}
}
