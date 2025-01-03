package Algoritham;

public class Quick_Sort{
	public Quick_Sort()
	{
		int low=0;
		int[] arr = {8,3, 2, 5, 4, 3};
		int high=arr.length-1;
		Quick_Sort(arr,low,high);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private void Quick_Sort(int[] arr,int low,int high) {
		if(low>high)
		{
			return;
		}
		int pibot=quickSort(arr,low,high);
		Quick_Sort(arr,low,pibot-1);
		Quick_Sort(arr,pibot+1,high);
	}

	public static int quickSort(int [] arr,int low,int high)
	{
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<=high;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		return i;
	}
}
