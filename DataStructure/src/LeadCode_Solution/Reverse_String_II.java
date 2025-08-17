package LeadCode_Solution;

import java.util.Arrays;

public class Reverse_String_II {
	public Reverse_String_II()
	{
		String s = "abcdefgd"; 
	    int k = 3;
		System.out.println(reverseStr(s,k));
	}
	public String reverseStr(String s, int k) {
		int len=s.length()%k==0?(s.length()/k):(s.length()/k)+1,left=0,i=0;
		String word[]=new String[len];
		for(i=0;(i+k)<s.length();i=i+k)
		{
			word[left]=s.substring(i,k+i);
			left++;
		}
		word[left]=s.substring(i,s.length());
		for(i=0;i<word.length;i=i+2)
		{
			word[i]=new StringBuilder(word[i]).reverse().toString();
		}
		s=String.join("",word);
		return s;
	}
}
