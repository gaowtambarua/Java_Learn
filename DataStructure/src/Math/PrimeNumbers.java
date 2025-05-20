package Math;

public class PrimeNumbers {
	public PrimeNumbers()
	{
		int n = 15;  // আপনি চাইলে এখানে যেকোনো সীমা দিতে পারেন
		///////////////// 1 2 3 4 5 6 7 8 9 10 11 12 13 14
		System.out.println(countPrimes(n));
	}
	public int countPrimes(int n) {
		
		int count=0;
		for(int number=2;number<n;number++)
		{
			if(isPrime(number))
			{
				count++;
			}
		}
		
		
		return count;
	}
	private boolean isPrime(int number)
	{
		for(int i=2;i<=Math.sqrt(number);i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
