package Algoritham.Sort;

import java.util.Arrays;

import LeadCode_Solution.Happy_Number;

public class Heap_Sort {
//	public Heap_Sort()
//	{
//		int low=0;
//		int[] arr = {14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
//		int n = arr.length;
//		// jodi n=length hoi theory hobe=(n/2)-1
//		// jodi n=length-1 hoi theory hobe=(n-1)/2
//        // Build a max heap
//        for (int i = n/2-1; i >= 0; i--) {
//            heapify(arr, n, i);
//          
//        }
//        System.out.println();
//        
//        for (int i = n - 1; i >= 1; i--) {
//            // Move current root to end
//            int temp = arr[0];
//            arr[0] = arr[i];
//            arr[i] = temp;
//            heapify(arr, i, 0);
//        }
//        
//        for(int i=0;i<arr.length;i++){
//        	System.out.print(arr[i]+" ");
//        }
//	}
	
//	  public static void heapify(int arr[], int n, int i) {
//	        int largest = i; // Initialize largest as root
//	        int left = 2 * i + 1; // left child index
//	        int right = 2 * i + 2; // right child index
//
//	        // If left child is larger than root
//	        if (left < n && arr[left] > arr[largest]) {
//	            largest = left;
//	        }
//
//	        // If right child is larger than largest so far
//	        if (right < n && arr[right] > arr[largest]) {
//	            largest = right;
//	        }
//	        if (largest != i) 
//	        {
//	            int temp = arr[i];
//	            arr[i] = arr[largest];
//	            arr[largest] = temp;
//	            heapify(arr, n, largest);
//	        }
//	    }
	
	
	public Heap_Sort()
	{
		int [] a={1,2,3,4,5,6,7,8};
		int n=a.length;
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(a,i,n);
		}
		
		for(int i=n-1;i>=1;i--)
		{
			int temp =a[0];
			a[0]=a[i];
			a[i]=temp;
			heapify(a,0,i);
		}
		
		System.out.println(Arrays.toString(a));
	}
	public void heapify(int [] a,int i,int n)
	{
		int left=i*2+1;
		int right=i*2+2;
		int largest=i;
		if(left<n&&a[largest]<a[left])
		{
			largest=left;
		}
		if(right<n&&a[largest]<a[right])
		{
			largest=right;
		}
		if(i!=largest)
		{
			int temp=a[largest];
			a[largest]=a[i];
			a[i]=temp;
			heapify(a,largest,n);
		}
	}
}
