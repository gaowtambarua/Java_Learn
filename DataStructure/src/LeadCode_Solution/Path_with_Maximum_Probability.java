package LeadCode_Solution;
import java.util.*;

public class Path_with_Maximum_Probability {

	  static class Pair {
	        int node;
	        double prob;

	        Pair(int node, double prob) {
	            this.node = node;
	            this.prob = prob;
	        }
	    }

	public static double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {

        // Build adjacency list
        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double p = succProb[i];

            graph.get(u).add(new Pair(v, p));
            graph.get(v).add(new Pair(u, p));
        }
        double[] maxProb=new double[n];
        maxProb[start]=1.0;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->Double.compare(b.prob,a.prob));
        pq.add(new Pair(start,1.0));
        while(!pq.isEmpty())
        {
        	Pair present=pq.poll();
        	int u=present.node;
        	double presentProb=present.prob;
        	
        	if(end==u)
        	{
        		return maxProb[u];
        	}
        	
//        	if(presentProb<maxProb[u])
//        	{
//        		continue;
//        	}
        	
        	for(Pair next : graph.get(u))
            {
            	int node=next.node;
            	double prob=next.prob*presentProb;
            	if(maxProb[node]<prob)
            	{
            		maxProb[node]=prob;
            		pq.add(new Pair(node,maxProb[node]));
            	}
            }
        }
        
        return 0.0;
    }


	public Path_with_Maximum_Probability()
	{
		 int n = 3, start = 0, end = 2;

	        int[][] edges = {{0,1},{1,2},{0,2}};
	        double[] succProb = {2,4,3};

	        double result = maxProbability(n, edges, succProb, start, end);

	        System.out.println("Output: " + result);
	}
}
