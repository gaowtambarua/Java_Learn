package LeadCode_Solution;

import java.util.Arrays;

public class Permutation_in_String {
	public Permutation_in_String()
	{
		String s1 = "ab", s2 = "eidbaooo";
		System.out.println(checkInclusion(s1, s2));
	}
	public boolean checkInclusion(String s1, String s2) {
		int n=s1.length();
		char [] a=s1.toCharArray();
		Arrays.sort(a);
		for(int i=0;i<=s2.length()-n;i++)
		{
			char [] b=s2.substring(i,i+n).toCharArray();
			Arrays.sort(b);
			if(Arrays.equals(a, b))
			{
				return true;
			}
		}
		return false;
	}
	

	
}
