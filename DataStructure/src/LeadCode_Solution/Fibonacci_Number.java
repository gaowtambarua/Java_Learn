package LeadCode_Solution;

import java.util.ArrayList;

/////Memoization
public class Fibonacci_Number {
	public Fibonacci_Number()
	{
		System.out.println(fib(6));
	}
	public int fib(int n) {
		int [] memo=new int[n+1];
		return f(n,memo);
	}
	public int f(int n,int [] memo)
	{
		if(n<=1)
		{
			return n;
		}
		if(memo[n]!=0)
		{
			return memo[n];
		}
		return memo[n]=f(n-1,memo)+f(n-2,memo);
	}
}
