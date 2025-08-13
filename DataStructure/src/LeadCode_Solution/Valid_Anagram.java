package LeadCode_Solution;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Valid_Anagram {
	public Valid_Anagram()
	{
		String s = "acc", t = "acc";
		
		System.out.println(isAnagram(s, t));
	}
	public boolean isAnagram(String s, String t) {
//		if(s.length()!=t.length())
//		{
//			return false;
//		}
//		char [] chars=s.toCharArray();
//		char [] chart=t.toCharArray();
//		Arrays.sort(chart);
//		Arrays.sort(chars);
//		return Arrays.equals(chars, chart);
		
		
		if(s.length()!=t.length())
		{
			return false;
		}
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(char chars : s.toCharArray())
		{
			map.put(chars,map.getOrDefault(chars, 0)+1);
		}
		for(char chars : t.toCharArray())
		{
			if(!map.containsKey(chars))
			{
				return false;
			}
			map.put(chars, map.get(chars)-1);
			
            if (map.get(chars) == 0) {
                map.remove(chars);
            }
		}
		return true;
	}
}
