package LeadCode_Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Reverse_String {
	public Reverse_String()
	{
		List<Character> s1=Arrays.asList('h','e','l','l','o');
		Collections.reverse(s1);
		System.out.println("s1 = "+s1);
		

		char s []= {'h','e','l','l','o'};
		reverseString(s);
		System.out.println(Arrays.toString(s));
	}
	public void reverseString(char[] s) {
		int left=0,right=s.length-1;
		while(left<right)
		{
			char ch=s[right];
			s[right]=s[left];
			s[left]=ch;
			left++;
			right--;
		}
	}
}
