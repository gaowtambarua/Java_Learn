package Mattrix;

import java.util.Arrays;

public class Maximum_Side_Length_of_a_Square {

	public int maxSideLength(int[][] mat, int threshold) {
		
		int m=mat.length;
		int n=mat[0].length;
		
		// Step 1: Prefix Sum Matrix তৈরি
		int[][] prefix=new int[m+1][n+1];
		
		
		
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				prefix[i][j]=mat[i-1][j-1]+
						prefix[i-1][j]+
						prefix[i][j-1]-
						prefix[i-1][j-1];
			}
		}
        int left = 0, right = Math.min(m, n);
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isPossible(prefix, mid, threshold, m, n)) {
                ans = mid;       // valid হলে store করি
                left = mid + 1;  // আরো বড় try করি
            } else {
                right = mid - 1; // ছোট side length try করি
            }
            System.out.println(mid+" ");
        }

        return ans;
	}
    private boolean isPossible(int[][] prefix, int k, int threshold, int m, int n) {
        for (int i = k; i <= m; i++) {
            for (int j = k; j <= n; j++) {

                int sum = prefix[i][j]
                        - prefix[i - k][j]
                        - prefix[i][j - k]
                        + prefix[i - k][j - k];
                if (sum <= threshold) {
                    return true;
                }
            }
        }

        return false;
    }
	

	public Maximum_Side_Length_of_a_Square()
	{
		int[][] mat={
				{6,30,40,50,30,40,50},
				{60,70,80,90,30,40,50},
				{100,110,101,202,30,40,50},
				{100,110,101,202,30,40,50},
				{100,110,101,202,30,40,50},
				{100,110,101,202,30,40,50},
				{100,110,101,202,30,40,50},
				{100,110,101,202,30,40,50},
				{1,2,3,4,30,40,50},
				{1,2,3,4,30,40,50},
		};

		int threshold=10;
		
		System.out.println(maxSideLength(mat,threshold));
	}
}
