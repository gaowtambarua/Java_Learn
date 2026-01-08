package Algoritham.Tree.Week_7;
import java.util.*;
public class My_Practice {
	boolean[] visit;
	ArrayList<ArrayList<Integer>> adj;
	public void addEdge(int u,int v)
	{
		visit=new boolean[3];
		adj.get(u).add(v);
		adj.get(v).add(u);
		
		
		System.out.println(hasCycle(u,-1));
	}
	
	public boolean hasCycle(int node,int parent)
	{
		visit[node]=true;
		for(int val : adj.get(node)){
			if(!visit[val])
			{
				if(hasCycle(val,node))
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
	public My_Practice()
	{
		adj=new ArrayList<>();
		for(int i=0;i<3;i++)
		{
			adj.add(new ArrayList<>());
		}
		addEdge(0,1);
		addEdge(0,2);
		addEdge(1,2);
	}
}
