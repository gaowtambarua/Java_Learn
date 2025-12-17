package Algoritham.Tree.Week_7;
import java.util.*;
public class DFS_Java_Code {
	
	class Graph{
		int v;
		ArrayList<ArrayList<Integer>> adj;
		
		
		public Graph(int v)
		{
			this.v=v;
			this.adj=new ArrayList<>();
			for(int i=0;i<v;i++)
			{
				adj.add(new ArrayList<>());
			}
		}
		
		public void addEdge(int u,int v)
		{
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		
		public void dfs(int node,boolean[] visited)
		{
			visited[node]=true;
			System.out.print(node + " ");
			for(int val : adj.get(node))
			{
				if(! visited[val])
				{
					dfs(val,visited);
				}
			}
		}
	}
	
	public DFS_Java_Code()
	{
		Graph g=new Graph(4);
		
//		0 --- 1
//		|     |
//		2 --- 3
		
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,3);
		g.addEdge(2,3);
		
		boolean[] visited=new boolean[4];
		g.dfs(0,visited);
	}
}
