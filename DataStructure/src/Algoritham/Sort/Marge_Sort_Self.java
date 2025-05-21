package Algoritham.Sort;

public class Marge_Sort_Self {
	public Marge_Sort_Self()
	{
		int [] a={8,3,6,3,2};
		marge(a,0,a.length-1);
	}
	public void marge(int [] a,int left,int right)
	{
		// 1 2 3 4 5
		if(left==right)
		{
			return;
		}
		int mid=(left+(right-1))/2;
		marge(a,left,mid);
		marge(a,mid+1,right);
	}
}
