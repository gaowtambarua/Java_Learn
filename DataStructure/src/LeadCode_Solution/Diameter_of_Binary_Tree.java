package LeadCode_Solution;



public class Diameter_of_Binary_Tree {
	
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

	int max=Integer.MIN_VALUE;
	
	
	public Diameter_of_Binary_Tree()
	{
		TreeNode root=new TreeNode(-5);
		root.left=new TreeNode(-1);
		root.right=new TreeNode(-6);
		root.left.left=new TreeNode(-3);
		System.out.println(diameterOfBinaryTree(root));
	}
	
	public int diameterOfBinaryTree(TreeNode root) {

        createLength(root);
        return max;
        
    }
    public int createLength(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=createLength(root.left);
        int right=createLength(root.right);
        max=Math.max(max,left+right);
        return Math.max(left,right)+1;
    }
}
