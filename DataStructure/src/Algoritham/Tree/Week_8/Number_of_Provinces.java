package Algoritham.Tree.Week_8;
import java.util.*;
public class Number_of_Provinces {

	class Graph{
		int v,result=0,time=0;
		ArrayList<ArrayList<Integer>> adj;
		
		int[] low,disc;
		public Graph(int n)
		{
			this.v=n;
			low=new int[n];
			disc=new int[n];
			adj=new ArrayList<>();
			for(int i=0;i<v;i++)
			{
				adj.add(new ArrayList());
			}
			Arrays.fill(disc,-1);
		}
		
		void addEdge(int a,int b)
		{
			adj.get(a).add(b);
		}
		
		void dfs(int u)
		{
			low[u]=disc[u]=time++;
			for(int v : adj.get(u))
			{
				if(disc[v]==-1)
				{
					dfs(v);
					low[u] = Math.min(low[u], low[v]);
				}
				else
				{
					low[u] = Math.min(low[u], low[v]);
				}
			}
			if(disc[u]==low[u])
			{
				result++;
			}
		}
		void tarjanscc()
		{
			for(int i=0;i<v;i++)
			{
				if(disc[i]==-1)
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
		
		g.tarjanscc();
		
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
	}

}
