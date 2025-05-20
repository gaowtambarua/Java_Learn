package LeadCode_Solution;

public class Add_Digits {
	public Add_Digits()
	{
		System.out.println(addDigits(38));
	}

	public int addDigits(int n) {
		while(n/10!=0)
		{
			int sum=0;
			while(n!=0)
			{
				int k=n%10;
				n=n/10;
				sum=k+sum;
			}
			n=sum;
		}
		return n;
	}
}
