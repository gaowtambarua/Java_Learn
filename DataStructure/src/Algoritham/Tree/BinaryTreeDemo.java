package Algoritham.Tree;

public class BinaryTreeDemo {
	public BinaryTreeDemo ()
	{
		// Tree বানাচ্ছি:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
		
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		System.out.println("Root value = " +root.val);
		System.out.println("Left child of 2 = "+root.left.left.val);
		System.out.println("Left child of 2 = "+root.left.left.left);
		
	}
}
