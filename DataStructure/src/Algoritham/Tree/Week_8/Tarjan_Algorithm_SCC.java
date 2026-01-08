package Algoritham.Tree.Week_8;
import java.util.*;
public class Tarjan_Algorithm_SCC {

	class Graph
	{
		int v;
		ArrayList<ArrayList<Integer>> adj;
		int time=0;
		int[] disc,low;
		boolean[] onStack;
		Stack<Integer> st;
		Graph(int v)
		{
			this.v=v;
			adj=new ArrayList<>();

			for(int i=0;i<this.v;i++)
			{
				adj.add(new ArrayList());
			}

			//			adj.get(0).add(1);
			//			adj.get(1).add(2);
			//			//adj.get(2).add(0);
			//			adj.get(2).add(3);
			//			adj.get(3).add(4);
			//			adj.get(4).add(2);


			adj.get(1).add(6);
			adj.get(6).add(3);
			adj.get(3).add(5);
			adj.get(5).add(4);
			adj.get(4).add(3);

			disc=new int[this.v];
			low=new int[this.v];
			onStack=new boolean[this.v];
			st=new Stack<>();

			Arrays.fill(disc,-1);

		}

		void dfs(int u)
		{
			disc[u] = low[u] = time++;
			st.push(u);
			onStack[u] = true;

			for(int v : adj.get(u))
			{
				if(disc[v]==-1)
				{
					dfs(v);
					low[u] = Math.min(low[u], low[v]);
				}

				else if (onStack[v]) {
					low[u] = Math.min(low[u], disc[v]);
				}
			}

			// SCC root found
			if (low[u] == disc[u]) {
				System.out.print("SCC: ");
				while (true) {
					int node = st.pop();
					onStack[node] = false;
					System.out.print(node + " ");
					if (node == u) 
					{
						break;
					}
				}
				System.out.println();
			}
		}

		void tarjanSCC()
		{
			for(int i=0;i<v;i++)
			{
				if(disc[i]==-1)
				{
					dfs(i);
				}
			}
		}
	}

	public Tarjan_Algorithm_SCC()
	{
		Graph g=new Graph(7);

		g.tarjanSCC();
	}
}
