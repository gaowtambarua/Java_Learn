package Algoritham.Tree.Week_8;

import java.util.*;
public class Strongly_Connected_Components_SCC {


	class Graph{
		int v;
		ArrayList<ArrayList<Integer>> adj;

		Graph()
		{
			v=5;
			adj=new ArrayList<>();

			for(int i=0;i<v;i++)
			{
				adj.add(new ArrayList<>());
			}

			adj.get(0).add(1);
			adj.get(1).add(2);
			//adj.get(2).add(0);
			adj.get(2).add(3);
			adj.get(3).add(4);
			adj.get(4).add(2);
		}
		void dfs1(int node,boolean[] visited,Stack<Integer> st)
		{
			visited[node]=true;

			for(int nei : adj.get(node))
			{
				if(!visited[nei])
				{
					dfs1(nei,visited,st);
				}
			}
			st.push(node);
		}

		// Reverse graph
		Graph reverseGraph()
		{
			Graph rev=new Graph();
			rev.adj.clear();
			for(int i=0;i<v;i++)
			{
				rev.adj.add(new ArrayList<>());
			}

			for(int i=0;i<v;i++)
			{
				for(int nei : adj.get(i))
				{
					rev.adj.get(nei).add(i);
				}
			}

			return rev;
		}

		void dfs2(int node,boolean[] visited)
		{
			visited[node]=true;
			System.out.print(node+" ");
			for(int nei : adj.get(node))
				if (!visited[nei]) {
					dfs2(nei, visited);
				}	
		}


		// Kosaraju main logic
		void findSCC()
		{
			Stack<Integer> st=new Stack<>();
			boolean[] visited=new boolean[v];

			// step 1
			for(int i=0;i<v;i++)
			{
				if(!visited[i])
				{
					dfs1(i,visited,st);
				}
			}

			// Step 2
			Graph rev=reverseGraph();
			Arrays.fill(visited,false);

			// Step 3
			System.out.println("Strongly Connected Components:");

			while(!st.isEmpty())
			{
				int node=st.pop();
				if(!visited[node]){
					rev.dfs2(node,visited);
					System.out.println();
				}
			}
		}

	}


	public Strongly_Connected_Components_SCC()
	{
		//		0 → 1
		//		↑   ↓
		//		└── 2
		//
		//		0 → 1 → 2 → 0 possible
		//		👉 তাই {0,1,2} = একটা SCC
		///////////////////////////////////////
		//		0 → 1 → 2
		//		0 → 2 যাওয়া যায়
		//		কিন্তু 2 → 0 আসা যায় না ❌
		//		👉 তাই আলাদা আলাদা SCC:{0}, {1}, {2}



		Graph g=new Graph();
		g.findSCC();
	}
}
