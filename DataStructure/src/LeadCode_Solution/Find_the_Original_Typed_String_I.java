package LeadCode_Solution;

import java.util.Arrays;

public class Find_the_Original_Typed_String_I {
	public Find_the_Original_Typed_String_I()
	{
		String word = "abbcccc";
		System.out.println(possibleStringCount(word));
	}
	public int possibleStringCount(String word) {
		int len=word.length(),count=1;
	       for(int i=1;i<len;i++)
	       {
	            if(word.charAt(i)==word.charAt(i-1))
	            {
	                count++;
	            }
	       }
	       return count;
	}
}
