package LeadCode_Solution;
import java.util.*;
public class Number_of_Provinces {

	/////////////////////////////////////////////// Using DSA
	
	class DSU{
		
		int[] parent,rank;
		
		public DSU(int n)
		{
			parent=new int[n];
			rank=new int[n];
			
			for(int i=0;i<n;i++)
			{
				parent[i]=i;
			}
		}
		
		int find(int x)
		{
			if(parent[x]!=x)
			{
				parent[x]=find(parent[x]);
			}
			return parent[x];
		}
		
		void union(int a ,int b)
		{
			 int pa=find(a);
			 int pb=find(b);
			 if(rank[pa]==rank[pb])
			 {
				 parent[pb]=pb;
				 rank[pa]++;
			 }
			 if(rank[pa]<rank[pb])
			 {
				 parent[pa]=pb;
			 }
			 else
			 {
				 parent[pb]=pa;
			 }
		}
	}

	public int findCircleNum(int[][] isConnected) {
		List<List<Integer>> edge=new ArrayList<>();
		int n=isConnected.length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j&&isConnected[i][j]==1)
				{
					edge.add(Arrays.asList(i,j));
				}
			}
		}
		
		DSU dsu=new DSU(n);
		int result=0,size=edge.size();
		for(int i=0;i<size;i++)
		{
			int a=edge.get(i).get(0);
			int b=edge.get(i).get(1);
			if(dsu.find(a)==dsu.find(b))
			{
				result++;
			}
			dsu.union(a,b);
		}
		return result+(n-size);
	}













	///////////////////////////////////////////////// Using Tarjan	


	//	private class Graph{
	//		int v,time=0,result=0;
	//		ArrayList<ArrayList<Integer>> adj;
	//		int[] low,desc;
	//		public Graph(int n)
	//		{
	//			this.v=n;
	//			adj=new ArrayList<>();
	//			low= new int[v];
	//			desc=new int[v];
	//			Arrays.fill(desc, -1);
	//			for(int i=0;i<v;i++)
	//			{
	//				adj.add(new ArrayList<>());
	//			}
	//		}
	//		
	//		void addEdge(int a,int b)
	//		{
	//			adj.get(a).add(b);
	//		}
	//		private void dfs(int u)
	//		{
	//			low[u]=desc[u]=time++;
	//			for(int v : adj.get(u))
	//			{
	//				if(desc[v]==-1)
	//				{
	//					dfs(v);
	//					low[u]=Math.min(low[v],low[u]);
	//				}
	//				else
	//				{
	//					low[u]=Math.min(desc[v],low[u]);
	//				}
	//			}
	//			if(low[u]==desc[u])
	//			{
	//				result++;
	//			}
	//		}
	//		private void tarjanSCC()
	//		{
	//			for(int i=0;i<v;i++)
	//			{
	//				if(desc[i]==-1)
	//				{
	//					dfs(i);
	//				}
	//			}
	//		}
	//	}
	//	
	//	public int findCircleNum(int[][] isConnected) {
	//		int n=isConnected.length;
	//		
	//		Graph g=new Graph(n);
	//		int i=0;
	//		for(int[] v : isConnected)
	//		{
	//			for(int j=0;j<n;j++)
	//			{
	//				if(j!=i&&v[j]==1)
	//				{
	//					g.addEdge(i,j);
	//				}
	//			}
	//			i++;
	//		}
	//		
	//		g.tarjanSCC();
	//		return g.result;
	//	}


	///////////////////////// Main /////////////////////////

	public Number_of_Provinces()
	{
		int[][] isConnected={
				{1,1,0},
				{1,1,0},
				{0,0,1}
		};

		System.out.println(findCircleNum(isConnected));

	}

}
