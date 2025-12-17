package LeadCode_Solution;

public class Range_Sum_Query_Mutable {
	
	class NumArray {
		int [] tree;
		int n=0;
	    public NumArray(int[] nums) {
	    	n=nums.length;
	    	tree=new int[n*4];
	    	buildTree(1,0,n-1,nums);
	    }
	    public void buildTree(int node,int start,int end,int[] nums)
	    {
	    	if(start==end)
	    	{
	    		tree[node]=nums[start];
	    		return;
	    	}
	    	int mid=start+(end-start)/2;
	    	buildTree(node*2,start,mid,nums);
	    	buildTree(node*2+1,mid+1,end,nums);
	    	tree[node]=tree[node*2]+tree[node*2+1];
	    }
	    public void update(int index, int val) {
	        update(1,0,n-1,index,val);
	    }
	    public void update(int node,int start,int end,int index,int val)
	    {
	    	if(start==end)
	    	{
	    		tree[node]=val;
	    		return;
	    	}
	    	int mid=start+(end-start)/2;
	    	if(index<=mid)
	    	{
	    		update(node*2,start,mid,index,val);
	    	}
	    	else
	    	{
	    		update(node*2+1,mid+1,end,index,val);
	    	}
	    	tree[node]=tree[node*2]+tree[node*2+1];
	    }
	    
	    public int sumRange(int left, int right) {
	        return sumRange(1,0,n-1,left,right);
	    }
	    public int sumRange(int node,int start,int end,int left,int right)
	    {
	    	if(end<left||right<start)
	    	{
	    		return 0;
	    	}
	    	if(left<=start&&end<=right)
	    	{
	    		return tree[node];
	    	}
	    	int mid=start+(end-start)/2;
	    	int l=sumRange(node*2,start,mid,left,right);
	    	int r=sumRange(node*2+1,mid+1,end,left,right);
	    	return l+r;
	    }
	}
	
	
	
	public Range_Sum_Query_Mutable()
	{
		int [] arr={0,9,5,7,3};
		NumArray numArray=new NumArray(arr);
		System.out.println(numArray.sumRange(1,2));
		numArray.update(1, 2);
		System.out.println(numArray.sumRange(1,2));
	}

}
