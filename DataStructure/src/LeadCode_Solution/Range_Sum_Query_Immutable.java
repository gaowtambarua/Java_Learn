package LeadCode_Solution;

public class Range_Sum_Query_Immutable {
	
	class NumArray {
		int []bit;
		int n;
		public NumArray(int[] nums) {
	        n=nums.length;
	        bit=new int[n+1];
	        
	        // build bit 
	        for(int i=0;i<n;i++)
	        {
	        	update(i+1,nums[i]);
	        }
	    }
	    public  void update (int i,int val)
	    {
	    	while(i<=n)
	    	{
	    		bit[i]=bit[i]+val;
	    		i=i+lowbit(i);
	    	}
	    }
	    public int lowbit(int x)
	    {
	    	return x&-x;
	    }
	    
	    public int prefixsum(int num)
	    {
	    	int sum=0;
	    	while(num>0)
	    	{
	    		sum=sum+bit[num];
	    		num=num-lowbit(num);
	    	}
	    	return sum;
	    }
	    
	    public int sumRange(int left, int right) {
	        return prefixsum(right+1)-prefixsum(left);
	    }
	}
	
	public  Range_Sum_Query_Immutable()
	{
		int[] arr={-2, 0, 3, -5, 2, -1};
		NumArray num=new NumArray(arr);
		System.out.println(num.prefixsum(6));
	}
}
