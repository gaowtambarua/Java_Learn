package Contest;

public class Maximize_Sum_of_Squares_of_Digits {
	public Maximize_Sum_of_Squares_of_Digits()
	{
		System.out.println(maxSumOfSquares(2,11));
	}
	public String maxSumOfSquares(int num, int sum) {
		if(num*9<sum)
		{
			return "";
		}
		StringBuilder result=new StringBuilder();
		for(int i=1;i<=num;i++)
		{
			int min=sum<9?sum:9;
			result.append(min);
			sum=sum-min;
		}
		return result.toString();
	}
}
