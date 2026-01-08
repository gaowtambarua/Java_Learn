package Algoritham.Tree.Week_8;
import java.util.*;
public class Kruskal_Algorithm {
	class Edge {
		int u, v, wt;

		Edge(int u, int v, int wt) {
			this.u = u;
			this.v = v;
			this.wt = wt;
		}
	}

	class DSU{
		int[] parent;
		int[] rank;

		DSU(int n)
		{
			parent = new int[n];
			rank = new int[n];
			for(int i=0;i<n;i++)
			{
				parent[i]=i;
			}
		}

		int find(int x)
		{
			if(parent[x]!=x)
			{
				parent[x]=find(parent[x]);
			}
			return parent[x];
		}
		boolean union(int a,int b)
		{
			int pa=find(a);
			int pb=find(b);

			if(pa==pb)
			{
				return false;  //cycle detected;
			}

			if (rank[pa] < rank[pb]) {
				parent[pa] = pb;
			} else if (rank[pa] > rank[pb]) {
				parent[pb] = pa;
			} else {
				parent[pb] = pa;
				rank[pa]++;
			}
			return true;
		}
	}

	public  Kruskal_Algorithm()
	{
		int V = 5;

		List<Edge> edges = new ArrayList<>();

		// STEP 1: sort edges by weight

		edges.add(new Edge(4, 1, 1));
		edges.add(new Edge(2, 3, 1));
		edges.add(new Edge(3, 4, 1));
		edges.add(new Edge(1, 2, 1));
		edges.add(new Edge(3, 1, 1));
		Collections.sort(edges,(a,b)->a.wt-b.wt);

		DSU dsu=new DSU(V);
		int mstWeight=0;
		System.out.println("Edges in MST: ");

		System.out.println("Edges in MST:");


		// Step 2: pick edges

		for(Edge e : edges)
		{
			int u=e.u;
			int v=e.v;
			if(dsu.union(u,v))
			{
				System.out.println(e.u + " -- " + e.v + " == " + e.wt);
				 mstWeight =mstWeight+ e.wt;
			}
		}
		 System.out.println("Total MST Weight = " + mstWeight);
	}
}
