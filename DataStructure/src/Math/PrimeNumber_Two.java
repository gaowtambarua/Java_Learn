package Math;

import java.util.Arrays;

public class PrimeNumber_Two {
	public PrimeNumber_Two()
	{
		System.out.println(countPrimes(3));
	}
	
	public int countPrimes(int n) {
	   int count=0;
	   if(n<2)
	   {
		   return count;
	   }
	   boolean [] data =new boolean [n];
	   Arrays.fill(data, true);
	   
	   for(int i=2;i*i<n;i++)
	   {
		   for(int j=i*i;j<n;j=j+i)
		   {
			    data[j]=false;
		   }
	   }
	   
	   
	   for(int i=2;i<n;i++)
	   {
		   if(data[i])
		   {
			  count++; 
		   }
	   }
		
       return count;
    }
}
