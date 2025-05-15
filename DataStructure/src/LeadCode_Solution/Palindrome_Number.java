package LeadCode_Solution;

import java.util.Arrays;

public class Palindrome_Number {
	public Palindrome_Number()
	{
		int x=-121;
//		System.out.println(isPalindrome(x));
		System.out.println(isPalindrome(x));
	}
	public boolean isPalindrome(int x) {
		if(x<0){
			return false;
		}
		int i=0;
		int p=x;
		while(x!=0)
		{
			i = i*10 + x%10;
			x = x/10;
			
		}
		return p==i;
    } 
	
//	public boolean isPalindrome(int x) {
//        String s=String.valueOf(x);
//		int i=0;
//		int l=s.length()-1;
//		boolean valid=false;
//		while(i<=l)
//		{
//			if(s.charAt(i)==s.charAt(l))
//			{
//				valid=true;
//			}
//			else
//			{
//				valid=false;
//				break;
//			}
//			i++;
//			l--;
//		}
//        return valid;
//    }
}
