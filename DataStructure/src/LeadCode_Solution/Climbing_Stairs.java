package LeadCode_Solution;

public class Climbing_Stairs {
	public Climbing_Stairs()
	{
		System.out.println(climbStairs(20));
	}
		public int climbStairs(int n) {
			
			int [] mem= new int[n+1];
			return fib(n,mem);
		}
		public int fib (int n,int [] mem)
		{
			if(n<=3)
			{
				return n;
			}
			if(mem[n]!=0)
			{
				return mem[n];
			}
			mem[n]=fib(n-1,mem)+fib(n-2,mem);
			return mem[n];
		}
//	public int climbStairs(int n) {
//		if(n<=3)
//		{
//			return n;
//		}
//		int [] mem=new int [n+1];
//		mem[2]=2;
//		mem[3]=3;
//		for(int i=4;i<=n;i++)
//		{
//			mem[i]=mem[i-1]+mem[i-2];
//		}
//		return mem[n];
//	}
}
