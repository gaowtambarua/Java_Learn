package Algoritham.Tree.Week_7;
import java.util.*;
public class DFS_Cycle_Detection {
	
	////////////////
	/////////////  Class 4 Code: Undirected Graph Cycle Detection (DFS)
	
	class Graph{
		
		int v;
		ArrayList<ArrayList<Integer>> adj;
		public Graph(int v)
		{
			this.v=v;
			adj=new ArrayList();
			
			for(int i=0;i<v;i++)
			{
				adj.add(new ArrayList<>());
			}
		}
		
		public void adj(int u,int v)
		{
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		
		public boolean hasCycle()
		{
			boolean[] visited=new boolean[v];
			
			for(int i=0;i<v;i++)
			{
				if(!visited[i])
				{
					if(dfsCycle(i,-1,visited))
					{
						return true;
					}
				}
			}
			return false;
		}
		
		
		private boolean dfsCycle(int node,int parent,boolean[] visited)
		{
			visited[node]=true;
			for(int val : adj.get(node))
			{
				if(!visited[val])
				{
					if(dfsCycle(val,node,visited))
					{
						return true;
					}
				}
				else if(val!=parent)
				{
					return true;
				}
			}
			return false;
		}
	}
	
	
	
	public DFS_Cycle_Detection()
	{
		Graph g=new Graph(3);
		
		g.adj(0,1);
		g.adj(1,2);
		g.adj(0,2);
		
		System.out.println(g.hasCycle());
		
	}

}
