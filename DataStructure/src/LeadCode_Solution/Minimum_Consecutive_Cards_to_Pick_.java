package LeadCode_Solution;

import java.util.HashSet;
import java.util.Set;

public class Minimum_Consecutive_Cards_to_Pick_ {
	public Minimum_Consecutive_Cards_to_Pick_()
	{
		int [] cards = {1,1};
		System.out.println(minimumCardPickup(cards));
		int i=Integer.MAX_VALUE;
		System.out.println(i);
	}
	public int minimumCardPickup(int[] cards) {
		Set<Integer> count=new HashSet<Integer>();
		int len=cards.length,left=0,high=len,result=len,contain=1;
		for(int right=0;right<len;right++)
		{
			while(count.contains(cards[right]))
			{
				count.remove(cards[left]);
				result=right-left+1;
				left++;
				contain=0;
			}
			count.add(cards[right]);
			high=Math.min(result, high);
		}
		return contain==1?-1:high;
	}
}
