package LeadCode_Solution;
import java.util.*;
public class Number_of_Provinces {

	private class Graph{
		int v,time=0,result=0;
		ArrayList<ArrayList<Integer>> adj;
		int[] low,desc;
		public Graph(int n)
		{
			this.v=n;
			adj=new ArrayList<>();
			low= new int[v];
			desc=new int[v];
			Arrays.fill(desc, -1);
			for(int i=0;i<v;i++)
			{
				adj.add(new ArrayList<>());
			}
		}
		
		void addEdge(int a,int b)
		{
			adj.get(a).add(b);
		}
		private void dfs(int u)
		{
			low[u]=desc[u]=time++;
			for(int v : adj.get(u))
			{
				if(desc[v]==-1)
				{
					dfs(v);
					low[u]=Math.min(low[v],low[u]);
				}
				else
				{
					low[u]=Math.min(desc[v],low[u]);
				}
			}
			if(low[u]==desc[u])
			{
				result++;
			}
		}
		private void tarjanSCC()
		{
			for(int i=0;i<v;i++)
			{
				if(desc[i]==-1)
				{
					dfs(i);
				}
			}
		}
	}
	
	public int findCircleNum(int[][] isConnected) {
		int n=isConnected.length;
		
		Graph g=new Graph(n);
		int i=0;
		for(int[] v : isConnected)
		{
			for(int j=0;j<n;j++)
			{
				if(j!=i&&v[j]==1)
				{
					g.addEdge(i,j);
				}
			}
			i++;
		}
		
		g.tarjanSCC();
		return g.result;
	}

	public Number_of_Provinces()
	{
		int[][] isConnected={
				{1,1,0},
				{1,1,0},
				{0,0,1}
		};
		
		System.out.println(findCircleNum(isConnected));
		
		int a='d'+'e'+'e'+'e';
		System.out.println(a);
	}

}
