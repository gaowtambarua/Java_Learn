package LeadCode_Solution;

import java.util.HashSet;
import java.util.Set;

public class Happy_Number {

	public Happy_Number()
	{
		System.out.println(isHappy(2));
	}
	public boolean isHappy(int n) {
		Set<Integer> set=new HashSet<Integer>();
		while(n!=1&&!set.contains(n))
		{
			set.add(n);
			int sum=0;
			while(n!=0)
			{
				int k=n%10;
				n=n/10;
				sum=k*k+sum;
			}
			n=sum;
		}
		return n==1;
	}
}
