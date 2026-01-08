package LeadCode_Solution;
import java.util.*;
public class Network_Delay_Time {

	class Pair{
		int node,dist;
		public Pair(int n,int d)
		{
			this.node=n;
			this.dist=d;
		}
	}
	int diskstra(List<List<Pair>> adj,int n,int k)
	{
		int[] dist=new int[n+1];
		Arrays.fill(dist, Integer.MAX_VALUE);

		PriorityQueue<Pair> pq=new PriorityQueue<>(
				(a,b)->a.dist-b.dist
				);
		dist[k]=0;
		pq.add(new Pair(k,0));
		while(!pq.isEmpty())
		{
			Pair note=pq.poll();
			int u=note.node;
			for(Pair val : adj.get(u))
			{
				int v=val.node;
				int di=val.dist;
				if(dist[u]+di<dist[v])
				{
					dist[v]=dist[u]+di;
					pq.add(new Pair(v,dist[v]));
				}
			}
		}

		int ans = 0;
		for (int i = 1; i <= n; i++) {
			if(dist[i]==Integer.MAX_VALUE)
			{
				return -1;
			}
//			System.out.println( dist[i]+" "+i );
			ans = Math.max(ans, dist[i]);
		}
		System.out.println(Arrays.toString(dist));

		return ans;
	}
	public int networkDelayTime(int[][] times, int n, int k) {

		List<List<Pair>> adj=new ArrayList<>();
		for(int i=0;i<=n;i++)
		{
			adj.add(new ArrayList());
		}
		for(int[] time : times)
		{
			adj.get(time[0]).add(new Pair(time[1],time[2]));

		}
		return diskstra(adj,n,k);
	}

	public Network_Delay_Time()
	{
		int[][] times={{1,2,1},{2,3,1},{2,4,2},{3,4,1},{4,1,1}};
		int n=4,k=2;
		System.out.println(networkDelayTime(times, n, k));
	}
}
