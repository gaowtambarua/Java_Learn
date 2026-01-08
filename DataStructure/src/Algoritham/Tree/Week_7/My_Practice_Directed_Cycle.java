package Algoritham.Tree.Week_7;
import java.util.*;
public class My_Practice_Directed_Cycle {
	
	ArrayList<ArrayList<Integer>> adj;
	boolean[] visited;
	boolean[] path;
	public void addEdge(int u,int v)
	{
		visited= new boolean[3];
		path= new boolean[3];
		adj.get(u).add(v);
		System.out.println(hasCycle(u));
	}
	private boolean hasCycle(int node)
	{
		visited[node]=true;
		path[node]=true;
		for(int val : adj.get(node))
		{
			if(!visited[val])
			{
				if(hasCycle(val))
				{
					return true;
				}
			}
			else if(path[val])
			{
				return true;
			}
		}
		path[node]=false;
		return false;
	}
	public My_Practice_Directed_Cycle()
	{
		adj=new ArrayList<>();
		
		for(int i=0;i<3;i++)
		{
			adj.add(new ArrayList());
		}
		
		addEdge(0,1);
		addEdge(1,2);
		
		addEdge(2,0);
	}
}
