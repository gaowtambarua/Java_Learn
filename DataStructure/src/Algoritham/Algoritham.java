package Algoritham;

import java.util.Arrays;

public class Algoritham {
	public Algoritham() {
		// binarySearch();
		algorithamFunction();
	}

	public void algorithamFunction() {
		//////////// Sort
		int[] a = { 1, 4, 3, 2, 6, 5, 7, 10, 8, 9 };
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		////////////////////////////////////
		//////// Binarary Search
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target = 9;
		int index = Arrays.binarySearch(arr, target);
		if (index >= 0) {
			System.out.println("\nElement " + target + " found at index " + index);
		} else {
			System.out.println("Element " + target + " not found.");
		}
	}

	public void binarySearch() {
		// int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// int target = 9;
		// int right = a.length - 1;
		// int left = 0;
		// int mid = 0;
		// while (left <= right) {
		// mid = (left + right) / 2;
		// if (a[mid] < target) {
		// left = mid + 1;
		// } else if (a[mid] > target) {
		// right = mid - 1;
		// } else {
		// break;
		// }
		// }
		// System.out.println("Target " + target + " Binary Search : " + mid);

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target = 9;
		int right = a.length - 1;
		int left = 0;
		int mid = -1;

		while (left <= right) { // ✅ ঠিক করা হয়েছে
			mid = (left + right) / 2;
			if (a[mid] == target) {
				System.out.println("Target " + target + " found at index: " + mid);
				return; // Target পেয়ে গেলে লুপ থেকে বেরিয়ে আসবে
			} else if (a[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		System.out.println("Target " + target + " not found!");

	}
}
