package Algoritham.Tree.Week_7;
import java.util.*;
public class Graph_Representation_Undirected_Graph {

	// Java এ Adjacency List তৈরি করা

	//Graph:
	//    0 -- 1
	//    |    |
	//    2 -- 3
	//	
	//	   0 1 2 3
	//	0 [0 1 1 0]
	//	1 [1 0 0 1]
	//	2 [1 0 0 1]
	//	3 [0 1 1 0]

	class Graph{
		int v;
		List<List<Integer>> adj;

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
			adj.get(v).add(u); // undirected
		}
		
		void printGraph()
		{
			for(int i=0;i<v;i++)
			{
				System.out.println(i+" -> "+adj.get(i));
			}
		}
	}


	public Graph_Representation_Undirected_Graph()
	{
		//Graph:
		//    0 -- 1
		//    |    |
		//    2 -- 3
		
		//     0 1 2 3			     0 1 2
		//	0 [0 1 1 0]       // 0   0 1 1  
		//	1 [1 0 0 1]       // 1   1 0 2  
		//	2 [1 0 0 1]       // 2   1 1 0
		//	3 [0 1 1 0]      
		Graph g = new Graph(3);
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,0);
//		g.addEdge(0,2);
//
//		g.addEdge(1,3);
//		g.addEdge(2,3);
		
		g.printGraph();
	}
}
