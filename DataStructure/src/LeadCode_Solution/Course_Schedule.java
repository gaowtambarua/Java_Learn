package LeadCode_Solution;
import java.util.*;
public class Course_Schedule {
	
	public boolean canFinish(int numCourses, int[][] prerequisites) {   
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int[] val : prerequisites)
        {
            adj.get(val[0]).add(val[1]);
        }

        int[] indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            for(int val : adj.get(i))
            {
                indegree[val]++;
            }
        }

        Queue<Integer> qu=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            {
                qu.offer(i);
            }
        }
        List<Integer> result=new ArrayList<>();
        while(!qu.isEmpty())
        {
            int node=qu.poll();
            result.add(node);
            for(int val : adj.get(node))
            {
                  indegree[val]--;
                  if(indegree[val]==0)
                  {
                    qu.offer(val);
                  }  
            }
        }

        return !(result.size() <numCourses);
    }
	
	public Course_Schedule()
	{
		
	}
}
