package LeadCode_Solution;
import java.util.*;
public class Find_if_Path_Exists_in_Graph {


	public boolean validPath(int n, int[][] edges, int source, int destination) {
		
		// Step 1: Build graph
		List<List<Integer>> adj=new ArrayList<>(); 
		for(int i=0;i<n;i++)
		{
			adj.add(new ArrayList<>());
		}
		
		for(int[] e : edges)
		{
			adj.get(e[0]).add(e[1]);
			adj.get(e[1]).add(e[0]);
		}
		
		// Step 2 : BFS
		boolean[] visited=new boolean[n];
		Queue<Integer> q=new LinkedList<>();
		q.add(source);
		visited[source]=true;
		while(!q.isEmpty())
		{
			int node=q.poll();
			
			if(node==destination)
			{
				return true;
			}
			
			for(int nei : adj.get(node))
			{
				if(!visited[nei])
				{
					visited[nei]=true;
					q.add(nei);
				}
			}
		}
		return false;
	}




	public Find_if_Path_Exists_in_Graph()
	{
		int n=6,source=3,destination=5;
//		int[][] edges={{0,1},{0,2},{3,5},{5,4}};
		//int[][] edges={{0,2},{0,1}};
		int[][] edges={{3,5},{5,4}};
		
		System.out.println(validPath(n,edges,source,destination));
	}
}
