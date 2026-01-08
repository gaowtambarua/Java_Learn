package Algoritham.Tree.Week_7;

public class Optimized_DSU_Java_Code {
	
	////////////  Optimized DSU //Works For Undirected graph

	class DSU{
		int[] parent;
		int[] rank;

		// Constructor
		DSU(int n)
		{
			parent=new int[n];
			rank=new int[n];

			for(int i=0;i<n;i++)
			{
				parent[i]=i;
				rank[i]=0;
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
				
				return false; // already same set → cycle
			}

			// union by rank
			if(rank[pa]<rank[pb])
			{
				
				parent[pa]=pb;
			}
			else if(rank[pb]<rank[pa])
			{
				parent[pb]=pa;
			}
			else
			{
				parent[pb]=pa;
				rank[pa]++;
			}

			return true;
		}
	}



	// Optimized DSU (Union-Find with Path Compression + Union by Rank)
	public Optimized_DSU_Java_Code()
	{

		int[][] edges = {
				{2, 1},
				{1, 0},
				{0,2} // cycle
		};

		DSU dsu=new DSU(3);
		boolean cycle=false;

		for(int[] e: edges)
		{
			int u=e[0];
			int v=e[1];

			if (!dsu.union(u, v)) {
				cycle = true; // cycle detected
				break;
			}
		}
		System.out.println(dsu.rank[1]);
		System.out.println("Cycle detected: " + cycle); // true
	}
}
