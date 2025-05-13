package Algoritham;

public class Two_Pointer_ {
	public Two_Pointer_()
	{
		int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 4;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] == target) {
                System.out.println("Target found at index (left): " + left);
                break;
            }
            if (nums[right] == target) {
                System.out.println("Target found at index (right): " + right);
                break;
            }

            left++;
            right--;
        }

        if (left > right) {
            System.out.println("Target not found.");
        }
	}
}
