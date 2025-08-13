package LeadCode_Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import dataStructure.HasMap;

public class Find_Resultant_Array_After_Removing_Anagrams {
	public Find_Resultant_Array_After_Removing_Anagrams()
	{
		String words [] = {"a","a","b","a"};
		System.out.println(removeAnagrams(words));
	}
	public List<String> removeAnagrams(String[] words) {
		
		HashMap<Integer,String> map =new HashMap<Integer,String>();
		for(int i=0;i<words.length;i++)
		{
			map.put(i, words[i]);
		}
		char [] temp=map.get(0).toCharArray();
		int n=map.size();
		for(int i=1;i<n;i++)
		{
			char [] b=map.get(i).toCharArray();
			Arrays.sort(temp);
			Arrays.sort(b);
			if(Arrays.equals(temp,b))
			{
				map.remove(i);
			}
			temp=b;
		}
		return new ArrayList<String>(map.values());
	}
}
