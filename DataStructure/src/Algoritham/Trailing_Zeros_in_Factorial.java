package Algoritham;

public class Trailing_Zeros_in_Factorial {
	public Trailing_Zeros_in_Factorial()
	{
		System.out.println(trailingZeroes(5));
		//////////5 factortorial er sheshe koita 0 ace ber korar theroy.
	}
	public int trailingZeroes(int n) {
		int count=0;
		while(n!=0)
		{
			n=n/5;
			count=count+n;
		}
		return count;
	}
}
