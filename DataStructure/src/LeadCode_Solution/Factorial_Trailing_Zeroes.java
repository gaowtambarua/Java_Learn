package LeadCode_Solution;

import java.math.BigInteger;

public class Factorial_Trailing_Zeroes {
	public Factorial_Trailing_Zeroes()
	{
		System.out.println(trailingZeroes(100));
	}
	
	///////////////////////////////////////////   ai ti leadcode time complexity problem korce
	public int trailingZeroes1(int n) {
		
		BigInteger result=BigInteger.ONE;
		for(int i=1;i<=n;i++)
		{
			result=result.multiply(BigInteger.valueOf(i));
		}
		String n2=String.valueOf(result);
		int len=n2.length()-1;
		int k=0;
		while(len>=0&&n2.charAt(len)=='0')
		{
			k++;
			len--;
		}
		
		return k;
	}
	///////////////////////////////////////////////////////////////// ai problem ti onek speed 
	   public int trailingZeroes(int n) {
	        int count = 0;
	        while (n >= 5) {
	            n=n/5;
	            count += n;
	        }
	        return count;
	    }
	
}
