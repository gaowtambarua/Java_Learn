package Algoritham.Tree.Week_5;

import java.util.*;
public class Count_of_Smaller_Numbers_After_Self {

	//	public List<Integer> countSmaller(int[] nums) {
	//		List<Integer> list=new ArrayList<>();
	//		int n=nums.length;
	//		for(int i=0;i<n;i++)
	//		{
	//			list.add(buildResult(i,n-1,nums[i],nums));
	//		}
	//		return list;
	//	}
	//	public int buildResult(int start,int end,int val,int[] arr)
	//	{
	//		if(start==end)
	//		{
	//			return arr[start]<val?1:0;
	//		}
	//		int mid=start+(end-start)/2;
	//		int left=buildResult(start,mid,val,arr);
	//		int right=buildResult(mid+1,end,val,arr);
	//		return left+right;
	//	}
	//	
	//	public Count_of_Smaller_Numbers_After_Self()
	//	{
	//		int[] nums={5,2,6,1};
	//		System.out.println(countSmaller(nums));
	//	}
	//////////////////////// time compexity er karone accept korce na



	class FenwickTree{
		int [] bit;
		int n;
		
		public FenwickTree(int n)
		{
			this.n=n;
			bit=new int[n+1];
		}
		void update(int index, int value)
		{
			while(index<=n)
			{
				bit[index]=bit[index]+value;
				index=index+(index & (-index));
			}
		}
		int query(int index)
		{
			int sum=0;
			while(index>0)
			{
				sum=sum+bit[index];
				index=index-(index & (-index));
			}
			return sum;
		}
	}
	

	public List<Integer> countSmaller(int[] nums)
	{
		int n=nums.length;
		Set<Integer> set=new HashSet<>();
		for(int num :nums)
		{
			set.add(num);
		}
		System.out.println(set);

		List<Integer> sorted = new ArrayList<>(set);
		Collections.sort(sorted);
		
		Map<Integer, Integer> rank = new HashMap<>();
		for(int i=0;i<sorted.size();i++)
		{
			rank.put(sorted.get(i),i+1);
		}
		
		FenwickTree ft=new FenwickTree(sorted.size());
		Integer[] result=new Integer[n];
		
		for(int i=n-1;i>=0;i--)
		{
			int r=rank.get(nums[i]);
			result[i]=ft.query(r-1);
			ft.update(r,1);
		}
		return Arrays.asList(result);
	}


	public Count_of_Smaller_Numbers_After_Self()
	{
		int[] nums={5,2,6,1};
		countSmaller(nums);
	}
}
