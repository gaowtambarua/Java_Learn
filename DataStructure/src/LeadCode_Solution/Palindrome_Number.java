package LeadCode_Solution;

import java.util.Arrays;

public class Palindrome_Number {
	public Palindrome_Number()
	{
		int x=123;
//		System.out.println(isPalindrome(x));
		isPalindrome(x);
	}
	public void isPalindrome(int x) {
		int i=0;
		while(x>i)
		{
			i = i*10 + x%10;
			x = x/10;
			System.out.println(i);
		}
		
		
    }
}
