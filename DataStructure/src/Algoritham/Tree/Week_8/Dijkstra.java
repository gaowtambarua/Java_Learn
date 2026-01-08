package Algoritham.Tree.Week_8;
import java.util.*;
public class Dijkstra {
	//Shortest Path Algritham
	class Pair{
		int node;
		int dist;
		Pair(int n,int d)
		{
			node=n;
			dist=d;
		}
	}
	int[] dijkstra(int v,List<List<Pair>> adj,int src)
	{
		int[] dist=new int[v];
		Arrays.fill(dist, Integer.MAX_VALUE);

		PriorityQueue<Pair> pq=new PriorityQueue<>(
				(a,b)->a.dist-b.dist
				);

		dist[src] = 0;

		pq.add(new Pair(src,0));

		while(!pq.isEmpty())
		{
			Pair cur=pq.poll();
			int u=cur.node;


			for(Pair nei : adj.get(u))
			{
				int n=nei.node;
				int di=nei.dist;

				if(dist[u]+di<dist[n])
				{
					dist[n]=dist[u]+di;
					pq.add(new Pair(n,dist[n]));
				}
			}
		}




		return dist;
	}
	public Dijkstra()
	{
		//        	4	
		//		0-------1
		//		|      /|
		//	    |     / |
		//	    |    /  |
		//	  1 | 2 /   | 1
		//	    |  /    |
		//		| /     |
		//      |/      |
		//		2-------3
		//	        5

		//		0---->1 dist=4
		//		0---->2 dist=1
		//		2---->1 dist=2
		//		0---->1 dist=4
		//		1---->3 dist=1
		//		2---->3 dist=5


		//		List<List<Pair>> adj=new ArrayList<>();
		//		int v=4; //nodes: 0,1,2,3
		//		int src=0;
		//
		//		for(int i=0;i<v;i++)
		//		{
		//			adj.add(new ArrayList<>());
		//		}
		//
		//		adj.get(0).add(new Pair(1,4));
		//		adj.get(0).add(new Pair(2,1));
		//
		//		adj.get(2).add(new Pair(1,2));
		//		adj.get(2).add(new Pair(3,5));
		//
		//		adj.get(1).add(new Pair(3,1));


		/////////////////////////////////////////////// Negative Value er jonno aiti kaz korbe na

		//    	   -2	
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
		//		0---->2 dist = -2 

		List<List<Pair>> adj=new ArrayList<>();
		int v=3; //nodes: 0,1,2,3
		int src=0;

		for(int i=0;i<v;i++)
		{
			adj.add(new ArrayList<>());
		}

		adj.get(2).add(new Pair(1,-2));
		adj.get(1).add(new Pair(0,1));
		adj.get(0).add(new Pair(2,-2));
		int[] dist=dijkstra(v,adj,src);

		System.out.println(" "+dist[0]);
	}
}
