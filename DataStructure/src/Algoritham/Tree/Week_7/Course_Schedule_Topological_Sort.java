package Algoritham.Tree.Week_7;
import java.util.*;
// Topological short shudu direcet graph er jonno  // udrect graph ba cycle er khettre kaz korbe na
public class Course_Schedule_Topological_Sort {
//	int v;
//	ArrayList<ArrayList<Integer>> adj;
//	private boolean result(int note,boolean[] visited,boolean[] path)
//	{
//		visited[note]=true;
//		path[note]=true;
//		for(int val : adj.get(note))
//		{
//			if(!visited[val])
//			{
//				if(result(val,visited,path))
//				{
//					return true;
//				}	
//			}
//			else if(path[val])
//			{
//				return true;
//			}
//			
//		}
//		path[note]=false;
//		return false;
//	}
//	
//	public boolean canFinish(int numCourses, int[][] prerequisites) {
//		this.v=numCourses;
//		adj=new ArrayList<>();
//		boolean[] visited=new boolean[v];
//		boolean[] path=new boolean[v];
//		for(int i=0;i<v;i++)
//		{
//			adj.add(new ArrayList());
//		}
//		
//		for(int[] val : prerequisites)
//		{
//			adj.get(val[0]).add(val[1]);
//		}
//		for(int i=0;i<v;i++)
//		{
//			if(!visited[i])
//			{
//				if(result(i,visited,path))
//				{
//					return false;
//				}
//			}
//			
//		}
//		
//		return true; 
//	}
/////////////////////////////////////////////////// 	
	
	
	
	
	
	

	public Course_Schedule_Topological_Sort()
	{
		int numCourses=2;
		int[][] prerequisites={
				{1,0},
				{0,1}
		};
		//System.out.println(canFinish(numCourses,prerequisites));
	}
}
