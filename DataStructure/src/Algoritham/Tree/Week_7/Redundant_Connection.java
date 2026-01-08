package Algoritham.Tree.Week_7;
import java.util.*;
public class Redundant_Connection {

	class Graph{
		int v;
		ArrayList<ArrayList<Integer>> adj;
		public Graph(int v)
		{
			this.v=v;
			adj=new ArrayList<>();

			for(int i=0;i<=v;i++)
			{
				adj.add(new ArrayList<>());
			}
		}
		
		public boolean  addEdge(int[] edge)
		{
			adj.get(edge[0]).add(edge[1]);
			adj.get(edge[1]).add(edge[0]);
			
			boolean[] visited=new boolean[v+1];
			if(dfsBuildResult(edge[0],0,visited))
			{
				return true;
			}
			return  false;
		}
		

		private boolean  dfsBuildResult(int node,int parent,boolean[] visited)
		{
			visited[node]=true;
			for(int val : adj.get(node))
			{
				if(!visited[val])
				{
					if(dfsBuildResult(val, node, visited))
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
	public int[] findRedundantConnection(int[][] edges) {
		
		Graph g=new Graph(edges.length);
		for(int[] val : edges)
		{
			if(g.addEdge(val))
			{
				return val;
			}
		}
		return new int[0];
	}

	public Redundant_Connection()
	{
//		int[][] edges={
//				{1,2},
//				{2,3},
//				{3,4},
//				{1,4},
//				{1,5}
//				};
		
		int[][] edges={
				{1,2},
				{1,3},
				{2,3}
				};
		int k[]=findRedundantConnection(edges);
		
		System.out.println(k[0]);
		System.out.println(k[1]);
	}
}
