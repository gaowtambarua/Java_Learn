package Algoritham.Tree.Week_3;
import java.util.*;
public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {

	public class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val)
		{
			this.val=val;
			this.left=null;
			this.right=null;
		}
	}

	public Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal()
	{
		int [] pre={1, 2, 3, 5, 6, 8, 9}, in={5, 2, 6, 1, 8, 3, 9};
		buildTree(pre,in);
	}
	Map<Integer,Integer> findIndex=new HashMap<>();
	int pre[];
	int preIndex =0;
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		for(int i=0;i<inorder.length;i++)
		{
			findIndex.put(inorder[i],i);
		}
		pre=preorder;
		return build(0,inorder.length-1);
	}
	private TreeNode build(int inStart, int inEnd) {
		if (inStart > inEnd) {
			return null;
		}


		int rootVal = pre[preIndex ++];
		TreeNode root = new TreeNode(rootVal);

		int inIndex = findIndex.get(rootVal);


		root.left = build(inStart, inIndex - 1);
		root.right = build(inIndex + 1, inEnd);

		return root;
	}

}
