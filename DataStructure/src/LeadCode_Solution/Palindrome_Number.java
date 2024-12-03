package LeadCode_Solution;

import java.util.Arrays;

public class Palindrome_Number {
	public Palindrome_Number()
	{
		int x=1214;
		//		System.out.println(isPalindrome(x));
		isPalindrome(x);
	}
	public void isPalindrome(int x) {
		
		////////////////////////////Step1
		int ka=0,m=0,reverse=x;
		while (reverse>0)
		{
			ka=reverse%10+m*10;
			reverse=reverse/10;
			m=ka;
		}
		System.out.println("Reverse "+ka);
		
		/////////////////////////////////////////Step 2
		String s=String.valueOf(x);
		int i=0;
		int l=s.length()-1;
		boolean valid2=false,valid3=false;
		while(i<=l)
		{
			if(s.charAt(i)==s.charAt(l))
			{
				valid2=true;
			}
			else
			{
				valid2=false;
				break;
			}
			i++;
			l--;
		}
		System.out.println("IsPalindrome2 test  number is : "+valid2);
		
		///////////////////////// Step 2
		
		s =Integer.toString(x);
		String r=new StringBuilder(s).reverse().toString();
		System.out.println("Reverse String  "+r);
//		if(s.equals(r))
//		{
//			valid3=true;
//		}
//		else
//		{
//			valid3=false;
//		}
		System.out.println("IsPalindrome3 test  number is : "+s.equals(r));
		
	}
}
