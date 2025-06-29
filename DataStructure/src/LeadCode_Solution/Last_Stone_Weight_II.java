package LeadCode_Solution;

import java.util.Arrays;

public class Last_Stone_Weight_II {
	
	public Last_Stone_Weight_II()
	{
		int [] a={1,1,2,3,5,8,13,21,34,55,89,14,23,37,61,98};
		System.out.println(lastStoneWeightII(a));
	}
	
	 public int lastStoneWeightII(int[] stones) {
		 if(stones.length<2)
		 {
			 return stones[0];
		 }
		 int index=1;
	       for(int a : stones)
	       {
	    	   if(index>2)
	    	   {
	    		   int max=Math.max(a, stones[0]);
	    		   int min=Math.min(a, stones[0]);
	    		   stones[0]=max-min; 
	    	   }
	    	   index++;
	       }
	       return Math.max(stones[0], stones[1])-Math.min(stones[0], stones[1]);
	    }  
}
