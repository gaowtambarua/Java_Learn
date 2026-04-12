package Math;

public class Binary_Exponentiation {
	
	// Binary_Exponentiation Theory
	// jokhon pow er man onk beshi hoi
	
	int mod=(int)1e9+7;
	long findpow(long a,long pow)
	{
		if(pow==0)// a^0=1
		{
			return 1;
		}
		long half=findpow(a, pow/2);
		long result=(half*half)%mod;
		if(pow%2==1)
		{
			result=(result*a)%mod;
		}
		return result;
	}
	
	public Binary_Exponentiation()
	{
		
	}
}
