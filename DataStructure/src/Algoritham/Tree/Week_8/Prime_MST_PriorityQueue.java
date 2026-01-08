package Algoritham.Tree.Week_8;
import java.util.*;

import Algoritham.Tree.Week_8.Kruskal_Algorithm.Edge;
public class Prime_MST_PriorityQueue {

	class Pair{
		int node,weight;
		public Pair(int node,int weight)
		{
			this.node=node;
			this.weight=weight;
		}
	}

	public int primMST(int v,ArrayList<ArrayList<Pair>> adj)
	{
		boolean[] visited=new boolean[v];

		PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.weight-b.weight);

		pq.add(new Pair(4, 0)); // start from node 0
		int mstCost = 0;

		while (!pq.isEmpty())
		{
			Pair cur=pq.poll();

			visited[cur.node]=true;
			mstCost=mstCost+cur.weight;

			for(Pair nei : adj.get(cur.node))
			{

				//	    		0 --5-- 1
				//	    		 \      |
				//	    		  6     4
				//	    		   \    |
				//	    		    ----2
				//	    		0--->1=5
				//	    		0--->2=6
				//	    		1--->2=4
				//
				//				visited = {0}
				//				PQ = (1,5), (2,6)
				//
				//				visited = {0,1}
				//				PQ = (2,6), (2,4)
				//
				//				visited = {0,1,2}
				//				PQ = (2,6)// 2 visit ar jabe na
				if(!visited[nei.node])
				{
					pq.add(new Pair(nei.node,nei.weight));
				}
			}
		}
		return mstCost;
	}

	public Prime_MST_PriorityQueue()
	{
		ArrayList<ArrayList<Pair>> adj=new ArrayList<>();

		int v=5,source=0;

		for(int i=0;i<v;i++)
		{
			adj.add(new ArrayList<>());
		}

		//		edges.add(new Edge(4, 1, 1));
		//		edges.add(new Edge(2, 3, 1));
		//		edges.add(new Edge(3, 4, 1));
		//		edges.add(new Edge(1, 2, 1));
		//		edges.add(new Edge(3, 1, 1));

		adj.get(4).add(new Pair(1,1));
		adj.get(2).add(new Pair(3,1));
		adj.get(3).add(new Pair(4,1));
		adj.get(1).add(new Pair(2,1));
		adj.get(3).add(new Pair(1,1));

		System.out.println(primMST(v, adj));
	}
}
