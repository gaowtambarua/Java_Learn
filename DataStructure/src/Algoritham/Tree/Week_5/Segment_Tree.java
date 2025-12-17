package Algoritham.Tree.Week_5;

public class Segment_Tree {

	class SegmentTree {
		int [] tree;
		int n;
		public SegmentTree (int [] arr)
		{
			n=arr.length;
			tree=new int [4*n];
			build(arr, 1, 0, n - 1);
			//			System.out.println(tree[0]);
			//			System.out.println(tree[1]);
			//			System.out.println(tree[2]);
			//			System.out.println(tree[3]);
			//			System.out.println(tree[4]);
			//			System.out.println(tree[5]);
			//			System.out.println(tree[6]);
			//			System.out.println(tree[7]);
			//			System.out.println(tree[8]);
			//			System.out.println(tree[9]);
			//			System.out.println(tree[10]);
			//			System.out.println(tree[11]);
			//			System.out.println(tree[12]);
			//			System.out.println(tree[13]);
			//			System.out.println(tree[14]);
			//			System.out.println(tree[15]);
			//			System.out.println(tree[16]);
			//			System.out.println(tree[17]);
			//			System.out.println(tree[18]);
			//			System.out.println(tree[19]);
			//			System.out.println(tree[20]);
			//			System.out.println(tree[21]);
			//			System.out.println(tree[22]);
			//			System.out.println(tree[23]);
			//			System.out.println(tree[24]);
			//			System.out.println(tree[25]);
			//			System.out.println(tree[26]);
			//			System.out.println(tree[27]);
			//			System.out.println(tree[28]);
			//			System.out.println(tree[29]);
			//			System.out.println(tree[30]);
			//			System.out.println(tree[31]);
			//			System.out.println(tree[32]);
			//			System.out.println(tree[33]);
		}
		void build(int[] arr,int node,int start,int end)
		{
			if(start==end)
			{
				tree[node]=arr[start];
				return ;
			}
			int mid=start+(end-start)/2;
			build(arr,node*2,start,mid);
			build(arr,node*2+1,mid+1,end);
			tree[node]=tree[node*2]+tree[node*2+1];
		}

		int query(int l, int r) {
			return query(1,0,n-1,l,r);
		}
		int query(int node,int start,int end,int l,int r)
		{
			if(end<l||r<start)
			{
				return 0;
			}
			if(l<=start&&end<=r)
			{
				return tree[node];
			}
			int mid=start+(end-start)/2;
			int left=query(node*2,start,mid,l,r);
			int right=query(node*2+1,mid+1,end,l,r);
			return left+right;

			// Query(1, 3) = 9
			// Query(1, 3) = 0


			///////////////////////////////  My Tachniq
			//			if(end<l||r<start)
			//			{
			//				return 0;
			//			}
			//			if(l<=start&&end<=r)
			//			{
			//				return tree[node];
			//			}
			//			int left =0,right=0;
			//			int mid=start+(end-start)/2;
			//			
			//			if(l<=mid)
			//			{
			//				left=query(node*2,start,mid,l,r);
			//			}
			//			if (r > mid)
			//			{
			//				right=query(node*2+1,mid+1,end,l,r);
			//			}
			//			return left+right;
		}


		public void update(int idx,int val)
		{
			updateVal(1,0,n-1,idx,val);
		}
		public void updateVal(int node,int start,int end,int idx,int val)
		{
			if(start==end)
			{
				tree[node]=val;
				return ;
			}
			int mid=start+(end-start)/2;
			if(idx<=mid)
			{
				updateVal(node*2,start,mid,idx,val);
			}
			else
			{
				updateVal(node*2+1,mid+1,end,idx,val);
			}
			tree[node]=tree[node*2]+tree[node*2+1];
		}


	}


	public Segment_Tree()
	{
		int [] arr={1,2,3,4,5,6,7,8,9,10};
		SegmentTree st = new SegmentTree(arr);

		System.out.println("Query(1, 3) = " + st.query(1, 3)); 

		// expected = 10

		st.update(2, 10); // arr[2] = 10
		//
		System.out.println("After update:");
		System.out.println("Query(1, 3) = " + st.query(1, 3)); 
	}
}
