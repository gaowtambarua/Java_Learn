package Algoritham.Tree;

public class Convert_Sorted_Array_to_Binary_Search_Tree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public Convert_Sorted_Array_to_Binary_Search_Tree()
	{
		int nums[]={-10,-3,0,5,9};
		sortedArrayToBST(nums);
		System.out.println();
	}
	public TreeNode sortedArrayToBST(int[] nums) {
		
		return buildBst(nums,0,nums.length-1);
	}
	public TreeNode buildBst(int [] nums,int low ,int high )
	{
		if(high<low)
		{
			return null;
		}
		int mid=low+(high-low)/2;
		TreeNode left=buildBst(nums,low,mid-1);
		TreeNode right=buildBst(nums,mid+1,high);
		
		TreeNode root=new TreeNode(nums[mid]);
		root.left=left;
		root.right=right;
		return root;
	}
}
