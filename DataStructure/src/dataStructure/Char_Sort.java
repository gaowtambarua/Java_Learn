package dataStructure;

import java.util.Arrays;

public class Char_Sort {
	
	public Char_Sort()
	{
		String num="4321";
		char firstname=num.charAt(0);
		char [] lastname=num.substring(1).toCharArray();
		Arrays.sort(lastname);
		System.out.println(lastname);
	}
}

