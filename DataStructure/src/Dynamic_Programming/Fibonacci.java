package Dynamic_Programming;

public class Fibonacci {
	
	int n=25;
	int[] dp = new int[n+1];
	public Fibonacci()
	{

		System.out.println(fib(n));
		fib2(25);
	}
	//////////////(Top-Down DP)
	int fib(int n) {

		if(n<=1)
		{
			return n;
		}
		if (dp[n] != 0) 
		{
			return dp[n]; 
		}
		dp[n]=fib(n-2)+fib(n-1);
		return dp[n];
	}

	//////////////(Bottom-up)
	void fib2(int n) {

		int n2 = 5;
        int[] dp2 = new int[n2 + 1];
        
        dp2[0] = 0;
        dp2[1] = 1;

        for (int i = 2; i <= n2; i++) {
            dp2[i] = dp2[i - 1] + dp2[i - 2];
        }

        System.out.println(dp[n2]); // O
	}
}
