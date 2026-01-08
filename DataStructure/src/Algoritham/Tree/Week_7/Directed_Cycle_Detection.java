package Algoritham.Tree.Week_7;
import java.util.*;
public class Directed_Cycle_Detection {

	class Graph
	{
		int v;
		ArrayList<ArrayList<Integer>> adj;
		public Graph(int v)
		{
			this.v=v;
			adj=new ArrayList<>();

			for(int i=0;i<v;i++)
			{
				adj.add(new ArrayList<>());
			}
		}
		// directed edge
		public void addEdge(int u,int v)
		{
			adj.get(u).add(v);
		}


		boolean hasCycle()
		{
			boolean[] visited = new boolean[v];
			boolean[] path = new boolean[v];
			
			for(int i=0;i<v;i++)
			{
				if(!visited[i])
				{
					if (dfs(i, visited, path)) {
	                    return true;
	                }
				}
			}
			
			return false;
		}
		
		boolean dfs(int node,boolean[] visited,boolean[] path)
		{
			visited[node]=true;
			path[node]=true;
			for(int val : adj.get(node))
			{
				if(!visited[val])
				{
					if(dfs(val,visited,path))
					{
						return true;
					}
				}
				else if(path[val])
				{
					return true;
				}
			}
			
			path[node]=false; // backtrack
			return false;
		}


	}

	public Directed_Cycle_Detection()
	{
		Graph g=new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(1, 3);
		g.addEdge(3, 2);
		g.addEdge(2, 3); 

		System.out.println(g.hasCycle()); // true
	}
}
