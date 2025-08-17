package LeadCode_Solution;

import java.util.Arrays;

public class Longest_Repeating_Character_Replacement {
	

	public Longest_Repeating_Character_Replacement()
	{
		String s="ABAB";
		int k=1;
		characterReplacement(s,k);
	}
	
	public int characterReplacement(String s, int k) {
		int [] count=new int [26];
		int max=0,left=0,length=0,maxlenth=0;
		for(int right=0;right<s.length();right++)
		{
			char ch=s.charAt(right);
			count[ch-'A']++;
			max=Math.max(max,count[ch-'A']);
			while(right-left+1-max>k)
			{
				char chl=s.charAt(left);
				left++;
				count[chl-'A']--;
				break;
			}
			maxlenth=Math.max(maxlenth, right-left+1);
		}
		return maxlenth;
	}
}
