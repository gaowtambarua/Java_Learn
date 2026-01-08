package LeadCode_Solution;
import java.util.*;
public class Course_Schedule_II {

	public int[] findOrder(int numCourses, int[][] prerequisites) {
		int[] inDegree=new int[numCourses];
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		for(int i=0;i<numCourses;i++)
		{
			adj.add(new ArrayList<>());
		}
		for(int[] edge: prerequisites)
		{
			adj.get(edge[0]).add(edge[1]);
		}
		
		for(int i=0;i<numCourses;i++)
		{
			for(int v : adj.get(i))
			{
				inDegree[v]++;
			}
		}
		
		Queue<Integer> qu=new LinkedList<>();
		for(int i=0;i<numCourses;i++)
		{
			if(inDegree[i]==0)
			{
				qu.offer(i);
			}
		}
		
		ArrayList<Integer> list=new ArrayList<>();
		while(!qu.isEmpty())
		{
			int node=qu.poll();
			list.add(node);
			for(int v : adj.get(node))
			{
				inDegree[v]--;
				if(inDegree[v]==0)
				{
					qu.offer(v);
				}
			}
		}
		int n=list.size();
		if(n<numCourses)
		{
			return new int[0];
		}
		int[] result=new int[n];
		for(int i=0;i<n;i++)
		{
			result[i]=list.get(n-i-1);
		}
		return result;
	}

	public Course_Schedule_II()
	{
		
		int num=3;
		int[][] prerequisites ={{0,2},{1,2},{2,0}};
		System.out.println(Arrays.toString(findOrder(num,prerequisites)));
	}
}
