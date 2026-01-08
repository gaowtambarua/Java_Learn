package Algoritham.Tree.Week_8;

import java.util.*;

public class Bellman_Ford_Negative_Cycle_Detect {

	//Edge 
	class Edge{
		int u,v,wt;

		Edge(int u,int v,int wegiht)
		{
			this.u=u;
			this.v=v;
			this.wt=wegiht;
		}
	}

	void bellmanFord(int v,List<Edge> edges, int src)
	{
		int[] dist=new int[v];
		Arrays.fill(dist,Integer.MAX_VALUE);
		dist[src]=0;

		// Step 1: Relax all edges V-1 times
		for(int i=1;i<=v-1;i++)
		{

			for(Edge e : edges)
			{
				int u=e.u;
				int V=e.v;
				int wt=e.wt; 
				if(dist[u] != Integer.MAX_VALUE &&
						dist[u] + wt < dist[V])
				{
					dist[V] = dist[u] + wt;
				}
			}
		}
		//		System.out.println(Arrays.toString(dist));

		// Step 2: Check for negative weight cycle
		for (Edge e : edges) {
			int u=e.u;
			int V=e.v;
			int wt=e.wt; 

			if (dist[e.u] != Integer.MAX_VALUE &&
					dist[e.u] + e.wt < dist[e.v]) {

				System.out.println("Negative Weight Cycle Detected!");
				return;
			}
		}

		// Print shortest distances
		System.out.println("Vertex \t Distance from Source");
		for (int i = 0; i < v; i++) {
			System.out.println(i + "\t\t" + (dist[i] == Integer.MAX_VALUE ? "INF" : dist[i]) );
		}

	}

	public Bellman_Ford_Negative_Cycle_Detect()
	{

		// 	       -2	
		//		1-------2
		//		|      /
		//	    |     / 
		//	    |    /  
		//	  1 |   / -2   
		//	    |  /    
		//		| /
		//      |/
		//		0

		//		2---->1 dist = -2
		//		1---->0 dist = 1
		//		0---->2 dist = -2         5


		List<Edge> edges=new ArrayList<>();

		// edges: (u, v, weight)
		edges.add(new Edge(2, 1, -2));
		edges.add(new Edge(1, 0, 1));
		edges.add(new Edge(0, 2, -2));

		int v = 3;      // nodes: 0,1,2
		int src = 2;
		bellmanFord(v, edges, src);
	}
}
