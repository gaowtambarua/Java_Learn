package Technique;

import java.util.Arrays;

public class Brute_Force {

	String s = "AABABBA"; 
	int k = 1;
	public Brute_Force()
	{
		characterReplacement(s, k);
		System.out.println();
	}
	
//	public int characterReplacement2(String s, int k) {
//		int n=s.length();
//		int max=0,r=0;
//		int fre[]=new int [26];
//		for(int right=0;i<n;i++)
//		{	
//			fre[s.charAt(right)-'A']++;
//			max=Math.max(max, fre[s.charAt(right)-'A']);
//			if((right+1)-max<=k)
//			{
//				max=max;
//			}
//			System.out.println(max);
//			System.out.println((i+1)-max<=k);
//		}
//		System.out.println(max);
//		return max;
//	}
	

	public int characterReplacement(String s, int k) {
		int n=s.length();
		int max=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				String sub=s.substring(i,j+1);
				if(canMakeSame(sub,k))
				{
					max=Math.max(max, sub.length());
				}
				else
				{
					break;
				}
				
			}
			
		}
		return max;
	}
	public boolean canMakeSame(String sub,int k)
	{
		int [] fre=new int [26];
		int max=0;
		for(char ch: sub.toCharArray()){
			fre[ch-'A']++;
			max=Math.max(max, fre[ch-'A']);
		}
		return sub.length()-max<=k;
	}
}
