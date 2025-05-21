package Algoritham.Sort;

public class Bubble_Sort {
	public Bubble_Sort()
	{
		function();
	}
	public void function()
	{
		int [] arr={41,9,9,48,11,2,11,12,28,10,15,4,16,48};
		//////////////////////////////////////////////////////////////////////////////
		/*      41,9, 9,48,11,2,11,12,28,10,15,4,16,48 
		 *  	9, 41,9, 48,11,2,11,12,28,10,15,4,16,48
		 *      9,9, 41,48, 11,2,11,12,28,10,15,4,16,48
		 *      9,9,41, 48,11, 2,11,12,28,10,15,4,16,48
		 *      9,9,41,11, 48,2, 11,12,28,10,15,4,16,48
		 *      *************************
		 *      ********
		 *                                                                     */
		int k=0;
		while(k==0)
		{
			k=1;
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
					k=0;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
