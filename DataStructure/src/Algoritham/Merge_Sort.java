package Algoritham;

import java.util.Arrays;

public class Merge_Sort {
	public Merge_Sort()
	{
		int [] arr={41,9,9,48,11,2,11,12,28,10,15,4,16,48,9,3};
		mergeSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

	public void mergeSort(int arr[])
	{
		if(arr.length==1)
		{
			return;
		}
		int mid=arr.length/2;
		int [] left=Arrays.copyOfRange(arr,0,mid);
		int [] right=Arrays.copyOfRange(arr, mid,arr.length);
		mergeSort(left);
		mergeSort(right);
		merge(arr,left,right);
	}
	private void merge(int [] arr,int [] left,int [] right)
	{
		int i=0,j=0,k=0;
		
		//arr={9,3};

		while (i<left.length&&j<right.length) 
		{
			if(left[i]<right[j])
			{
				arr[k]=left[i];
				i++;
				k++;
			}
			else
			{
				arr[k]=right[j];
				j++;
				k++;
			}
		}
		
		while(i<left.length)
		{
			arr[k]=left[i];
			k++;
			i++;
		}
		while (j < right.length) {
            arr[k] = right[j];
            k++;
            j++;
        }

	}
	
}
