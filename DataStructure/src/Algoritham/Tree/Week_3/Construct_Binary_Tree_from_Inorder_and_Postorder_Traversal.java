package Algoritham.Tree.Week_3;

import java.util.HashMap;
import java.util.Map;

public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
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
	public Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal()
	{
		int [] post={4, 5, 2, 6, 7, 3, 1}, in={4, 2, 5, 1, 6, 3, 7};
		buildTree(post,in);
	}
	int len=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        len=postorder.length-1;
        Map<Integer,Integer> index=new HashMap<>();
        for(int i=0;i<=len;i++)
        {
            index.put(inorder[i],i);
        }
        return build(postorder,index,0,len);
    }
    public TreeNode build(int[] postorder,Map<Integer,Integer> index,int left,int right)
    {
        if(left>right)
        {
            return null;
        }
        int val=postorder[len--];
        int rootIndex=index.get(val);
        TreeNode root=new TreeNode(val);
        root.right=build( postorder,index,rootIndex+1,right);
        root.left=build( postorder,index,left,rootIndex-1);
        return root;
    }
}
