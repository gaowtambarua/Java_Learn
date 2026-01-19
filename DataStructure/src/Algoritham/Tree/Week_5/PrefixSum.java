package Algoritham.Tree.Week_5;

public class PrefixSum {
	class FenwickTree {
		private int[] bit;
		private int n;
		public FenwickTree(int [] arr)
		{
			n=arr.length;
			bit=new int[n+1];

			// Build in O(n)
			for (int i = 0; i < n; i++) {
				System.out.println((i + 1)+"///////////////////////////////////////////////////\n");
				update(i + 1, arr[i]); 
				System.out.println();
			}
		}
		
		///////////////////////////////////////////////////

		public void update(int i,int data)
		{
			while(i<=n)
			{
				bit[i]=bit[i]+data;
				i=i+lowbit(i);
				System.out.println(i);
			}
		}
		private int lowbit(int x) {
			return x & -x;
		}
		
		////////////////////////////////////////////////////
		
		public void printBIT()
		{
			System.out.print("BIT: ");
			for (int i = 1; i <= n; i++) {
	            System.out.print(bit[i] + " ");
	        }
	        System.out.println();
		}
		
		///////////////////////////////////////////////////
		
		public int prefixSum(int i)
		{
			int sum=0;
			while(i>0)
			{
				sum=sum+bit[i];
				i=i-lowbit(i);
			}
			return sum;
		}
		
		private int rangeSum(int l,int r)
		{
			return prefixSum(r)-prefixSum(l-1);
		}
	}

	public PrefixSum()
	{
		int [] data={1,2,3,4, 5,6,7,8};
		FenwickTree ft=new FenwickTree(data);
		
		 ft.printBIT(); 
		 
		System.out.println(ft.prefixSum(7));  

		System.out.println(ft.rangeSum(5,8));
		
		
		ft.update(3, 10);  
		ft.printBIT();
		System.out.println(ft.prefixSum(3)); 

	}
}
