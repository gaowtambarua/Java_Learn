package Algoritham;

public class Selection_Sort {
	public Selection_Sort()
	{
		shorta1();
		System.out.println();
		shorta2();
	}
	
/////////////////////////////////////////////////////////Value wise short /////////////////////////////////////
	public void shorta1()
	{
		int [] arr={0,1,4,2,5,3,6,8,7,9};
		for(int j=0;j<arr.length-1;j++)
		{
			int min=arr[j];
			int n=j;
			for(int i=j+1;i<arr.length;i++)
			{
				if(arr[i]<min)
				{
					min=arr[i];
					n=i;
				}
			}
			int temp=0;
			temp=arr[j];
			arr[j]=arr[n];
			arr[n]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	/////////////////////////////////////////////////////////index wise short/////////////////////////
	
	
	public void shorta2()
	{
		int [] arr={0,0,0,2,5,3,6,8,7,9};
		for(int j=0;j<arr.length-1;j++)
		{
			int min=j;
			for(int i=j+1;i<arr.length;i++)
			{
				if(arr[i]<arr[min])
				{
					min=i;
				}
			}
			if(min!=j)
			{
				int temp=0;
				temp=arr[j];
				arr[j]=arr[min];
				arr[min]=temp;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
