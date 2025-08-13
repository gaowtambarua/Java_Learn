package LeadCode_Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Group_Anagrams {
	public Group_Anagrams()
	{
		String [] strs = {"eat","tea","tan","ate","nat","bat"};
		Map<String,List<String>> map=new HashMap<String, List<String>>();
		for(String str : strs)
		{
			char [] cha=str.toCharArray();
			Arrays.sort(cha);
			String stra=new String(cha);
			if(!map.containsKey(stra))
			{
				map.put(stra, new ArrayList<String>());
			}
			map.get(stra).add(str);
			
		}
		List<List<String>> list=new ArrayList<List<String>>(map.values());
		System.out.println(list);
	}
}
