package LeadCode_Solution;

public class Redundant_Connection_II {
	int size=0;
	int[]parent;
	int[]rank;
	
	public int find(int x)
	{
		if(parent[x]!=x)
		{
			parent[x]=find(parent[x]);
		}
		return parent[x];
	}
	
	public boolean union(int[] edge)
	{
		int pa=find(edge[0]);
		int pb=find(edge[1]);
		if(pa==pb)
		{
			return true;
		}
		if(rank[pa]==rank[pb])
		{
			parent[pb]=parent[pa];
			rank[pa]++;
		}
		else if(rank[pa]>rank[pb])
		{
			parent[pb]=parent[pa];
		}
		else
		{
			parent[pa]=parent[pb];
		}
		return false;
	}
	
	public int[] findRedundantDirectedConnection(int[][] edges) {
		size=edges.length;
		parent=new int[size+1];
		rank=new int[size+1];
		for(int i=1;i<=size;i++)
		{
			parent[i]=i;
			rank[i]=0;
		}
		int[] result=new int[2];
		
		for(int[] val : edges)
		{
			if(union(val))
			{
				result=val;
			}
		}
		
		return result;
	}

	public Redundant_Connection_II()
	{
		int[][] edges={{1,2},{1,3},{2,3}};
		for(int v : findRedundantDirectedConnection(edges))
		{
			System.out.print(v+" ");
		}
	}
}
