package LeadCode_Solution;

public class Reverse_Integer {
	public Reverse_Integer()
	{
		int x=1999999999;
		System.out.println(reverse(x));
		//-2,147,483,648 থেকে 2,147,483,647    
	}
	public int reverse(int x) {
		long result=0;
		while(x!=0)
		{
			result=result*10+(x%10);
			x=x/10;
		}
		if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE)
		{
			return 0;
		}
		return (int)result;
	}
}
