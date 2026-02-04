package Algoritham.Tree.Week_8;
import java.util.*;
public class Floyd_Warshall {

	////////////////////////////////////////////////////////////// Using DijKstra

	//	class Pair
	//	{
	//		char ch;
	//		int val;
	//		public Pair(char ch,int val)
	//		{
	//			this.ch=ch;
	//			this.val=val;
	//		}
	//	}
	//
	//	public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
	//		// Make Graph
	//		Map<Character,List<Pair>> adj=new HashMap<>();
	//		int v=original.length;
	//		for(int i=0;i<v;i++)
	//		{
	//			adj.put(original[i], new ArrayList<>());
	//		}
	//		for(int i=0;i<v;i++)
	//		{
	//			adj.get(original[i]).add(new Pair(changed[i],cost[i]));
	//		}
	//
	//		int n=source.length();
	//		long result=0;
	//		Map<Character, int[]> memo = new HashMap<>();
	//		for(int j=0;j<n;j++)
	//		{
	//			char s = source.charAt(j);
	//			char t = target.charAt(j);
	//
	//			if (s == t) continue;
	//			if(!memo.containsKey(s))
	//			{
	//				memo.put(s, dijKstra(adj, s));
	//			}
	//			int dist=(memo.get(s))[t-'a'];
	//			if(dist==Integer.MAX_VALUE)
	//			{
	//				return -1;
	//			}
	//			result=result+dist;
	//		}
	//		return result;
	//	}
	//
	//	int[] dijKstra(Map<Character,List<Pair>> adj, char src)
	//	{
	//		int[] dist=new int[26];
	//		Arrays.fill(dist,Integer.MAX_VALUE);
	//
	//		PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.val-b.val);
	//
	//		pq.add(new Pair(src,0));
	//		dist[src-'a']=0;
	//
	//		while(!pq.isEmpty())
	//		{
	//			Pair cur=pq.poll();
	//			char u =cur.ch;
	//			if(!adj.containsKey(u))
	//			{
	//				continue;
	//			}
	//			for(Pair node : adj.get(u))
	//			{
	//				char v=node.ch;
	//				int w=node.val;
	//				if(dist[u-'a']+w<dist[v-'a'])
	//				{
	//					dist[v-'a']=dist[u-'a']+w;
	//					pq.add(new Pair(v,dist[v-'a']));
	//				}
	//			}
	//		}
	//		return dist;
	//	}



	//////////////////////////////////////////// ////////////////////////////////////////////////////////////// Using Floyd–Warshall

	public long minimumCost(
			String source,
			String target, 
			char[] original, 
			char[] changed, 
			int[] cost
			){
		int INF = (int)1e9;
		int[][] dist=new int[26][26];
		
		// Step 1: initialize
		for(int i=0;i<26;i++)
		{
			Arrays.fill(dist[i], INF);
			dist[i][i]=0;
		}
		
		// Step 2: build graph
		for(int i=0;i<original.length;i++)
		{
			 int u = original[i] - 'a';
			 int v= changed[i] - 'a' ;
			 dist[u][v]=Math.min(cost[i],dist[u][v]);
		}
		
		  // Step 3: Floyd–Warshall
        for (int k = 0; k < 26; k++) {
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 26; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // Step 4: calculate answer
        long result = 0;
        for (int i = 0; i < source.length(); i++) {
            int s = source.charAt(i) - 'a';
            int t = target.charAt(i) - 'a';

            if (dist[s][t] == INF) return -1;
            result += dist[s][t];
        }

        return result;
	}





	public Floyd_Warshall()
	{
		String source="d",target="b";
		char[] original={'c'},
				changed={'b'};
		int[] cost=    {1,  2};


		System.out.println(minimumCost(source, target, original, changed, cost));
	}
}
