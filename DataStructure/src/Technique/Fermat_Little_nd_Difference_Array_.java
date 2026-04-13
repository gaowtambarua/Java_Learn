package Technique;
import java.util.*;
public class Fermat_Little_nd_Difference_Array_ {
	//////////// leadcode problem 3655;
	
	
	int mod=(int)1e9+7;

    // Binary exponentiation
    long pow(long a ,long b)
    {
        if(b==0)
        {
            return 1;
        }

        long half=pow(a,b/2);
        long result=(half*half)%mod;
        if(b%2==1)
        {
            result=(a*result)%mod;
        }
        return result;
    }




    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n=nums.length;
        int block=(int)Math.sqrt(n);// using squre root decomsiton.
        Map<Integer,List<int[]>> map =new HashMap<>();
        for(int[] query : queries)
        {
            int l=query[0];
            int r=query[1];
            int k=query[2];
            int v=query[3];
            if(k>=block)// using squre root decomsiton.
            {
                while(l<=r)
                {
                    nums[l]=(int)(((long)nums[l]*v)%mod);
                    l+=k;
                }
            }
            else
            {
                // for using differance array technique;
                map.computeIfAbsent(k,key->new ArrayList<>()).add(query);
            }               
        }

        // Differance array technique
        for(int key : map.keySet())
        {
            long[] dif=new long[n];
            Arrays.fill(dif,1);
            for(int[] query : map.get(key))
            {
                int l=query[0];
                int r=query[1];
                int v=query[3];
                
                dif[l]=(dif[l]*v)%mod;
                int step=(r-l)/key;
                int next=l+(step+1)*key;

                if(next<n)
                {
                    // dif[next]=(dif[next]/v)%mod // (a/b)%m a =(a*(b^-1)%mod) 
                    // now using Fermat’s Little Theorem= a * (b^(m-2))% m
                    dif[next]=dif[next]*pow(v,mod-2)%mod;
                }
            }

            for(int i=0;i<n;i++)
            {
                if(i-key>=0)
                {
                    dif[i]=(dif[i]*dif[i-key])%mod;
                }
                
            }

            for(int i=0;i<n;i++)
            {
                nums[i]=(int)((nums[i]*dif[i])%mod) ;  
            }
        }

        int result=0;

        for(int val : nums)
        {
            result^=val;
        }

        return result;
    }
}
