package Algoritham.Tree.Week_7;
import java.util.*;
public class BFS_Java_Code {
	
	class Graph{
		int v;
		ArrayList<ArrayList<Integer>> adj;
		
		public Graph(int v)
		{
			this.v=v;
			adj=new ArrayList<>();
			for(int i=0;i<v;i++)
			{
				adj.add(new ArrayList<>());
			}
		}
		
		public void addEdge(int u,int v)
		{
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		
		public void bfs(int node)
		{
			boolean[] visited=new boolean[v];
			Queue<Integer> q=new LinkedList<>();
			visited[node]=true;
			q.add(node);
			while(!q.isEmpty())
			{
				node=q.poll();
				System.out.print(node + " ");
				for(int val : adj.get(node))
				{
					if(!visited[val])
					{
						visited[val]=true;
						q.add(val);
					}
				}
			}
		}
	}
	
	public BFS_Java_Code()
	{
		Graph g=new Graph(4);
		
//		0 --- 1
//		|     |
//		2 --- 3
		
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,3);
		g.addEdge(2,3);
		
		 g.bfs(0);
	}
}
