package Algoritham.Tree.Week_7;
import java.util.*;
public class Topological_Sort_BFS {
  /// Topological short shudu direcet graph er jonno Topological short shudu direcet graph er jonno  // udrect graph ba cycle er khettre kaz korbe na

	public static List<Integer> topoSort(int v,List<List<Integer>> adj)
	{
		int[] indegree=new int[v];

		// // indegree হিসাব
		for(int u=0;u<v;u++)
		{
			for(int V : adj.get(u))
			{
				//System.out.println("V="+V+" u="+u);
				indegree[V]++;
			}
			//System.out.println();
		}
		//		for(int n : indegree)
		//		{
		//			System.out.println(n);
		//		}

		// indegree 0 হলে queue তে ঢোকাও
		Queue<Integer> q=new LinkedList<>();

		for(int i=0;i<v;i++)
		{
			if(indegree[i]==0)
			{
				q.offer(i);
			}
		}
		
		
		List<Integer> topo = new ArrayList<>();
		//BFS
		while(!q.isEmpty())
		{
			int node=q.poll();
			topo.add(node);
			for(int nei : adj.get(node))
			{
				indegree[nei]--;
				if(indegree[nei]==0)
				{
					q.offer(nei);
				}
			}
		}
		System.out.println(topo);
		
		return topo;
	}

	public  Topological_Sort_BFS()
	{
		int v=4;
		List<List<Integer>> adj = new ArrayList<>();

		for(int i=0;i<v;i++)
		{
			adj.add(new ArrayList<>());

		}


		// edges: 0→1, 0→2, 1→3, 2→3
//		adj.get(0).add(1);
//		adj.get(1).add(2);
//		adj.get(4).add(2);
//		adj.get(2).add(3);
//		adj.get(0).add(0);
		
		adj.get(0).add(3);
		adj.get(0).add(1);
		adj.get(1).add(2);
		adj.get(2).add(3);
// size < V হলে cycle আছে

		List<Integer> result = topoSort(v, adj);
	}
}
