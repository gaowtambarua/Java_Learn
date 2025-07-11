package LeadCode_Solution;

public class Number_of_1_Bits {
	public Number_of_1_Bits()
	{
		int n=11;
		System.out.println(hammingWeight(n));
	}
	public int hammingWeight(int n) {
		int k=0;
		while(n!=0)
		{
			k=n%2+k;
			n=n/2;
		}
		
		return k;
	}
}
