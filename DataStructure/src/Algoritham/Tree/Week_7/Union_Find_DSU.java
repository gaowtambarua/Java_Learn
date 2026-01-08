package Algoritham.Tree.Week_7;

public class Union_Find_DSU {
	
	/////////////// Basic DSU //Works For Undirected graph
	
	
	
	
	class DSU{
		int [] parent;
		DSU(int n)
		{
			parent=new int[n];
			for(int i=0;i<n;i++)
			{
				parent[i]=i;
			}
		}
		
		int find(int x)
		{
			if(parent[x]==x)
			{
				return x;
			}
			return find(parent[x]);
		}
		
		void union (int a,int b)
		{
			int pa = find(a);
            int pb = find(b);
            if (pa != pb) {
                parent[pb] = pa;
            }
		}
	}
	
	
	
	public Union_Find_DSU()
	{
		int[][] edges={
				{0,1},
				{1,2},
				{2,0}
		};
		
		DSU dsu=new DSU(3);
		
		boolean cycle=false;
		for(int[]e : edges)
		{
			if(dsu.find(e[0])==dsu.find(e[1]))
			{
				cycle = true;
                break;
			}
			dsu.union(e[0], e[1]);
		}
		
		System.out.println(cycle);
	}
}
