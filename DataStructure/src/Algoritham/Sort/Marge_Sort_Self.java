package Algoritham.Sort;

import java.util.Arrays;

public class Marge_Sort_Self {
	public Marge_Sort_Self()
	{
		int [] a={7,4,1,2,0,3,4};
		marge(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	public void marge(int [] a,int left,int right)
	{
		// 1 2 3 4 5
		if(left==right)
		{
			return;
		}
		int mid=(left+right)/2;
		marge(a,left,mid);
		marge(a,mid+1,right);
		shorting(a,left,mid,right);
		
	}
	public void shorting(int [] a,int left,int mid,int right)
	{
		int i=left,j=mid+1, k=0;
		 int[] temp = new int[right - left + 1];
		while(i<=mid&&j<=right)
		{
			if(a[i]<a[j])
			{
				temp[k]=a[i];
				i++;
				k++;
				
			}
			else
			{
				temp[k]=a[j];
				j++;
				k++;
			}
		}
		while(i<=mid)
		{
			temp[k]=a[i];
			k++;
			i++;
		}
		while(j<=right)
		{
			temp[k]=a[j];
			j++;
			k++;
		}
		for(i=0;i<right-left+1;i++)
		{
			a[left+i]=temp[i];
		}
	}
	
	
}
