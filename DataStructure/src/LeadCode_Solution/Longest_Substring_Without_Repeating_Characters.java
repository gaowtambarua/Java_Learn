package LeadCode_Solution;

import java.util.Arrays;
import java.util.Hashtable;

public class Longest_Substring_Without_Repeating_Characters {
	public Longest_Substring_Without_Repeating_Characters()
	{
		String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));
	}
	public int lengthOfLongestSubstring(String s) {
		
		Hashtable<Character, Integer> count=new Hashtable<Character,Integer>();
		int left=0,result=0;
		for(int right=0;right<s.length();right++)
		{
			char ch=s.charAt(right);
			count.put(ch,(count.getOrDefault(ch, 0)+1));
			while(count.get(ch)>1)
			{
				char ch1=s.charAt(left);
				count.put(ch1, (count.get(ch1)-1));
				left++;
			}
			result=Math.max(result,right+1-left);
		}
		return result;
	}
}
