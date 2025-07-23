package LeadCode_Solution;

public class Guess_Number_Higher_or_Lower {
	public Guess_Number_Higher_or_Lower()
	{
		System.out.println(guessNumber(6));
	}
	public int guessNumber(int n) {
		// 1 2 3 4 5 6 7 8 9 10
		int left=1,right=n;
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			if(guess(mid)==-1)
			{
				right=mid-1;
			}
			else if(guess(mid)==1)
			{
				left=mid+1;
			}
			else if(guess(mid)==0)
			{
				return mid;
			}
		}
		
		return -1;
	}
	int guess(int num)
	{
		if(num > 3)
		{
			return -1;
		}
		else if(num < 3)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
