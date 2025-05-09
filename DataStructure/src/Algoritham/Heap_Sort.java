package Algoritham;

public class Heap_Sort {
	public Heap_Sort()
	{
		int low=0;
		int[] arr = {3,2,4,8,5,3};
		int n = arr.length;
        // Build a max heap
        for (int i = n/2-1; i >= 0; i--) {
            heapify(arr, n, i);
          
        }
        System.out.println();
        
        for (int i = n - 1; i >= 1; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        
        for(int i=0;i<arr.length;i++){
        	System.out.print(arr[i]+" ");
        }
	}
	
	  public static void heapify(int arr[], int n, int i) {
	        int largest = i; // Initialize largest as root
	        int left = 2 * i + 1; // left child index
	        int right = 2 * i + 2; // right child index

	        // If left child is larger than root
	        if (left < n && arr[left] > arr[largest]) {
	            largest = left;
	        }

	        // If right child is larger than largest so far
	        if (right < n && arr[right] > arr[largest]) {
	            largest = right;
	        }
	        if (largest != i) 
	        {
	            int temp = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = temp;
	            heapify(arr, n, largest);
	        }
	    }
}
