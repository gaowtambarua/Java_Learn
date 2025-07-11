package LeadCode_Solution;

public class Check_if_Number_is_a_Sum_of_Powers_of_Three {
	public Check_if_Number_is_a_Sum_of_Powers_of_Three()
	{
		System.out.println(checkPowersOfThree(0));
	}
	public boolean checkPowersOfThree(int n) {
		int i,count=0,result=0;
		for( i=1;i<=n;i=i*3)
		{
			count++;
		}
		
		count=count-1;
		while(count>=0)
		{
			if(result+(int)Math.pow(3,count)<=n)
			{
				result=result+(int)Math.pow(3,count);
			}
			count--;
		}
		return result==n;
	}

}
