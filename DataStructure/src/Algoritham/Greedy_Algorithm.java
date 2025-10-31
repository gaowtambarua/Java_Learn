package Algoritham;

public class Greedy_Algorithm {
	public Greedy_Algorithm()
	{
		///////Ei algoritham er kaz hocce max number age dhorbe....
		//// 1,2,3,4,5,6,7,8,9 digit thake max number hocce 9;
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
