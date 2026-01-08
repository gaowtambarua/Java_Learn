package Algoritham.Tree.Week_7;
import java.util.*;
public class DFS_Based_Topological_Sort {
	
	class Graph
	{
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
		
		void addEdge(int u,int v)
		{
			adj.get(u).add(v);
		}
		
		void topoSort()
		{
			boolean[] visited=new boolean[v];
			Stack<Integer> stack=new Stack<>();
			for(int i=0;i<v;i++)
			{
				if(!visited[i])
				{
					dfs(i,visited,stack);
				}
			}
			
			while (!stack.isEmpty()) {
	            System.out.print(stack.pop() + " ");
	        }
		}
		private void dfs(int node,boolean[] visited,Stack<Integer> stack)
		{
			
			visited[node] = true;

	        for (int val : adj.get(node)) {
	            if (!visited[val]) {
	                dfs(val, visited, stack);
	            }
	        }

	        stack.push(node);
		}
	}
	
	public DFS_Based_Topological_Sort()
	{
		Graph g = new Graph(5);
		// Cycle থাকলে Topological Sort “Valid” হয় না
		// 3 0 er age hobe na
		// rules u → v থাকলে, u সবসময় v-এর আগে আসবে
//		g.addEdge(1,0);
//		g.addEdge(3,1);

//		adj.get(0).add(1);
//		adj.get(1).add(2);
//		adj.get(4).add(2);
//		adj.get(2).add(3);
//		
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(3,2);
		g.addEdge(2,3);
		g.topoSort();
		System.out.println();
	}
}
