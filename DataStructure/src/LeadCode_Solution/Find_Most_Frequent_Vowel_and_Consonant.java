package LeadCode_Solution;

import java.util.Hashtable;

public class Find_Most_Frequent_Vowel_and_Consonant {
	public Find_Most_Frequent_Vowel_and_Consonant()
	{
		String s = "successes";
		System.out.println(maxFreqSum(s));
	}
	public int maxFreqSum(String s) {
		int left=0,right=s.length()-1,v=0,c=0;
		Hashtable<Character,Integer> map=new Hashtable<Character,Integer>();
		while(left<=right)
		{
			if(left!=right)
			{
				map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)+1);
				map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
			}
			else
			{
				map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
			}
			left++;
			right--;
		}
		for(char ch : map.keySet())
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				v=Math.max(v,map.get(ch));
			}
			else
			{
				c=Math.max(c,map.get(ch));
			}
		}
		return v+c;
	}
}
