package LeadCode_Solution;

import java.util.HashMap;

public class Jewels_and_Stones {
	public Jewels_and_Stones()
	{
		String jewels = "aA", stones = "aAAbbbb";
		System.out.println(numJewelsInStones(jewels, stones));
	}
	public int numJewelsInStones(String jewels, String stones) {
		
		HashMap<Character, Character> result=new HashMap<Character, Character>();
		for(char ch : jewels.toCharArray())
		{
			result.put(ch, ch);
		}
		int count=0;
		for(char ch : stones.toCharArray())
		{
			if(result.containsKey(ch))
			{
				count++;
			}
		}
		return count;
	}
}
