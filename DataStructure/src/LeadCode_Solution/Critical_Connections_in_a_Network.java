package LeadCode_Solution;
import java.util.*;
public class Critical_Connections_in_a_Network {
	int v;
	ArrayList<ArrayList<Integer>> adj;
	int[] low,disc;
	boolean[] visited;
	int time=0;
	List<List<Integer>> result;
	public void dfs(int u, int parent)
	{
		low[u]=disc[u]=time++;
		for(int v : adj.get(u))
		{
			if (v == parent) continue;
			if(disc[v]==-1)
			{
				dfs(v,u);
				low[u] = Math.min(low[u], low[v]);
				if(disc[u]<low[v])
				{
					result.add(Arrays.asList(u,v));
				}
			}
			else
			{
				low[u]=Math.min(low[u],low[v]);
			}
		}
	}

	public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
		this.v=n;
		adj=new ArrayList<>();
		result=new ArrayList<>();
		low=new int[v];
		disc=new int[v];
		visited=new boolean[v];
		Arrays.fill(disc,-1);
		for(int i=0;i<v;i++)
		{
			adj.add(new ArrayList<>());
		}

		for(List<Integer> edge : connections)
		{
			int u = edge.get(0);
			int v = edge.get(1);
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		for (int i = 0; i < n; i++) {
			if (disc[i] == -1) {
				dfs(i, -1);
			}
		}
		return result;
	}


	public Critical_Connections_in_a_Network()
	{
		int n=6;
		List<List<Integer>> connections=new ArrayList<>();
		connections.add(Arrays.asList(0,1));
		connections.add(Arrays.asList(1,2));
		connections.add(Arrays.asList(2,3));
		connections.add(Arrays.asList(3,1));
		connections.add(Arrays.asList(2,4));
		connections.add(Arrays.asList(4,5));
		connections.add(Arrays.asList(5,1));

		System.out.println(criticalConnections(n, connections));
	}
}
